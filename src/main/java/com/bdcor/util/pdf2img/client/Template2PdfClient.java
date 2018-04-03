package com.bdcor.util.pdf2img.client;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.specific.SpecificRequestor;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import com.bdcor.util.pdf2img.Constant;
import com.bdcor.util.pdf2img.convert.Template2Pdf.PDFTempletStatistics;
import com.bdcor.util.temp2pdf.proto.PdfData;
import com.bdcor.util.temp2pdf.proto.Template2Pdf;
import com.bdcor.util.temp2pdf.proto.TemplateData;

public class Template2PdfClient {

	private String ip = "";
	private int port = Constant.SERVER_TemplatePdf;
	public Template2PdfClient(String ip,String port){
		this.ip = ip;
		if(StringUtils.isNotBlank(port)){
			this.port = Integer.parseInt(port);
		}
	}
	
	//将pdf模板转化为字节数组
	public ByteBuffer convert(File file, Map<CharSequence, CharSequence> map) throws IOException {
		byte[] bytes = FileUtils.readFileToByteArray(file);
		return convert(bytes, map);
	}

	public ByteBuffer convert(byte[] pdfByte,Map<CharSequence, CharSequence> map) throws IOException {
		NettyTransceiver client = new NettyTransceiver(new InetSocketAddress(ip, port));
		Template2Pdf proxy = (Template2Pdf) SpecificRequestor.getClient(Template2Pdf.class, client);
		//创建模板对象，并传入数据和模板的字节数组
		TemplateData templateData = new TemplateData();
		templateData.setParams2(map);
		templateData.setTemplate(ByteBuffer.wrap(pdfByte));
		//pdf模板和数据通过convert方法，生成pdf文档
		PdfData pdfData = proxy.convert(templateData);
		client.close();
		return pdfData.getPdfData();
	}
   
	
	
	
}
