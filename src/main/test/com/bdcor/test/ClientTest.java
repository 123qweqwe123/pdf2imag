package com.bdcor.test;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import com.bdcor.util.pdf2img.client.Img2PdfClient;

public class ClientTest {

	@Test
	public void clientTest() throws IOException{
		//Img2PdfClient client = new Img2PdfClient("172.31.131.144",null);
		//Img2PdfClient client = new Img2PdfClient("10.24.10.177",null);
		Img2PdfClient client = new Img2PdfClient("10.24.10.197",null);
		
		List<ByteBuffer> bytes = client.convert(new File("src/main/test/imgData.pdf"));
		
		int i = 0;
		for(ByteBuffer b:bytes){
			FileUtils.writeByteArrayToFile(new File("src/main/test/img_"+i+".jpg"), b.array());
			i++;
		}

	}
}
