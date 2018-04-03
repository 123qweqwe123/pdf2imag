package com.bdcor.util.pdf2img.client;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class ClientMain {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
			if (args.length != 1) {
	            System.out.println("服务ip必须填写");
	            System.exit(1);
	        }
			
			String ip = args[0];
			Img2PdfClient client = new Img2PdfClient(ip,null);
			
			List<ByteBuffer> bytes = client.convert(new File("test.pdf"));
			
			int i = 0;
			for(ByteBuffer b:bytes){
				FileUtils.writeByteArrayToFile(new File("img_"+i+".jpg"), b.array());
				i++;
			}

	}

}
