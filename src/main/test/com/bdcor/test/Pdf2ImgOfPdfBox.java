package com.bdcor.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import com.bdcor.util.pdf2img.convert.pdfbox.CustomPageDrawer;


public class Pdf2ImgOfPdfBox {
	@Test
	public void test() throws IOException{
		FileInputStream in = new FileInputStream(new File("src/main/test/test2.pdf"));
		List<byte[]> bytes = CustomPageDrawer.convert(in);
		
		int i = 0;
		for(byte[] b:bytes){
			FileUtils.writeByteArrayToFile(new File("src/main/test/img_"+i+".jpg"), b);
			i++;
		}
		
		in.close();
		
		
	}
	
}
