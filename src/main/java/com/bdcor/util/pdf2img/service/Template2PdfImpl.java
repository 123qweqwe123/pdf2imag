package com.bdcor.util.pdf2img.service;

import java.nio.ByteBuffer;
import java.util.Map;
import com.bdcor.util.pdf2img.convert.Template2Pdf.PDFTempletStatistics;
import com.bdcor.util.temp2pdf.proto.PdfData;
import com.bdcor.util.temp2pdf.proto.Template2Pdf;
import com.bdcor.util.temp2pdf.proto.TemplateData;

public class Template2PdfImpl implements Template2Pdf {

	@Override
	public PdfData convert(TemplateData templateData) {
		PDFTempletStatistics pDFTempletStatistics = new PDFTempletStatistics();
		ByteBuffer bb = templateData.getTemplate();
		Map<CharSequence, CharSequence> map = templateData.getParams2();
		byte[] templateBytes = bb.array();
		byte[] pdfBytes = null;
		try {
			//调用pdf API提供的生成pdf的方法
			pdfBytes = pDFTempletStatistics.pdfDataBytes(templateBytes, map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//创建pdf对象，给对象赋值
		PdfData pdfData = new PdfData();
		pdfData.setPdfData(ByteBuffer.wrap(pdfBytes));
		return pdfData;
	}

}
