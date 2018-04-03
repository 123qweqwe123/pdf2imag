package com.bdcor.util.pdf2img.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import com.bdcor.util.pdf2img.convert.pdfbox.CustomPageDrawer;
import com.bdcor.util.pdf2img.proto.ImgData;
import com.bdcor.util.pdf2img.proto.Pdf2Img;
import com.bdcor.util.pdf2img.proto.PdfData;

public class Pdf2ImgImpl implements Pdf2Img {

	@Override
	public ImgData convert(PdfData pdfData){
		
		ByteBuffer bb = pdfData.getPdfBytes();
		
		InputStream in = new ByteArrayInputStream(bb.array());
		List<byte[]> imgeBytes = null;
		try {
			imgeBytes = CustomPageDrawer.convert(in);
		} catch (IOException e) {
			
		}
		
		ImgData imgData = new ImgData();
		imgData.setImgBytes(conv(imgeBytes));
		
		return imgData;
	}
	
	
	private List<ByteBuffer> conv(List<byte[]> imgeBytes){
		List<ByteBuffer> r = new ArrayList<ByteBuffer>();
		for(byte[] b:imgeBytes){
			r.add(ByteBuffer.wrap(b));
		}
		
		return r;
	}

}
