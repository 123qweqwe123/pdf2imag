package com.bdcor.util.pdf2img;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.avro.ipc.NettyServer;
import org.apache.avro.ipc.Server;
import org.apache.avro.ipc.specific.SpecificResponder;

import com.bdcor.util.pdf2img.proto.Pdf2Img;
import com.bdcor.util.pdf2img.service.Pdf2ImgImpl;
import com.bdcor.util.pdf2img.service.Template2PdfImpl;
import com.bdcor.util.temp2pdf.proto.Template2Pdf;
import com.bdcor.util.test.StartJetty;

/**
 * 
 * @author 韩晓伟
 *
 */
public class ServiceMain {
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		if (args.length != 1) {
			System.out.println("服务ip必须填写");
			System.exit(1);
		}
		ip = args[0];
		startServer();
		StartJetty.StartJetty(ip);
		System.in.read();
	}

	private static String ip = "";
	private static int port = Constant.SERVER_PORT;
	private static int port_tempalatePDF = Constant.SERVER_TemplatePdf;
	private static Server server;

	private static void startServer() throws IOException {
		new NettyServer(new SpecificResponder(Pdf2Img.class, new Pdf2ImgImpl()), new InetSocketAddress(ip, port));
		new NettyServer(new SpecificResponder(Template2Pdf.class, new Template2PdfImpl()),
				new InetSocketAddress(ip, port_tempalatePDF));
	}
}
