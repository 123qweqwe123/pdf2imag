package com.bdcor.util.pdf2img.client;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.List;

import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.specific.SpecificRequestor;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

import com.bdcor.util.pdf2img.Constant;
import com.bdcor.util.pdf2img.proto.ImgData;
import com.bdcor.util.pdf2img.proto.Pdf2Img;
import com.bdcor.util.pdf2img.proto.PdfData;

public class Img2PdfClient {

	
	
	private String ip = "";
	private int port = Constant.SERVER_PORT;
	public Img2PdfClient(String ip,String port){
		this.ip = ip;
		if(StringUtils.isNotBlank(port)){
			this.port = Integer.parseInt(port);
		}
	}
	
	public List<ByteBuffer> convert(File file) throws IOException{
		byte[] bytes = FileUtils.readFileToByteArray(file);
		return convert(bytes);
	}
	
	public List<ByteBuffer> convert(byte[] pdfByte) throws IOException{
		NettyTransceiver client = new NettyTransceiver(new InetSocketAddress(ip,port));
        
		Pdf2Img proxy = (Pdf2Img) SpecificRequestor.getClient(Pdf2Img.class, client);
       
        PdfData pdfData = new PdfData();
        pdfData.setPdfBytes(ByteBuffer.wrap(pdfByte));
        
        ImgData imgData = proxy.convert(pdfData);

        
        
        client.close();
        return imgData.getImgBytes();
	}

}
