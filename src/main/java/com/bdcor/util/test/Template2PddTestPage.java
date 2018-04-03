package com.bdcor.util.test;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.mortbay.log.Log;


import com.bdcor.util.pdf2img.client.Template2PdfClient;
public class Template2PddTestPage extends HttpServlet {
	@Override
	public void destroy() {
        super.destroy(); // Just puts "destroy" string in log
        // Put your code here
    }
	@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		this.doPost(request, response);
    }

	@Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		response.setCharacterEncoding("UTF-8");
		writer.write("<!DOCTYPE html>");
		writer.write("<html>");
		writer.write("<head>");
		writer.write("<meta-charset=\"UTF-8\">");
		writer.write("<title>pdf</title>");
		writer.write("</head>");
		writer.write("<body>");
		writer.write("<h1 style=\"margin:0 auto;text-align: center;\">pdf</h1>");
		writer.write("<form action=\"http://"+StartJetty.servletip+":"+StartJetty.servletPort+"/template2Pdf\" method =\"post\" enctype=\"multipart/form-data\">");
		writer.write("<input type=\"file\" name =\"filename\"><br>");
		writer.write("<textarea name= \"mapvalue\" id=\"mapvalue\" rows=\"30\" cols=\"60\">");
		writer.write("misMatchingpersons=9; "
				+ "recycle2totalTubes=26; minorityMessages=7; whiteRatio=14; averRatio=17; "
				+"recycletotalTubes=22; recycleTotalPersons=21; scanTotalPersons=27; totalTubes=4; recycleSampleEndDate=12; "
				+"exceptionMessages=6; scan3totalTubes=33; scanEndDate=2; recycleSampleStartDate=11; grayRatio=15; scan2TotalPersons=34; "
				+"scan3TotalPersons=29; matchingRatio=11; purpleRatio=13; recycle3totalTubes=24; yellowRatio=16; "
				+"Matchingpersons=8; scantotalTubes=28; scan2totalTubes=35; scanStartDate=1; recycle3TotalPersons=23;" 
				+"recycle2TotalPersons=25; minorityExceptionMessages=12; totalPersons=3; comparedRatio=5"
				);
		writer.write("</textarea><br>");
		writer.write("<button type=\"submit\" name =\"submit\">提交</button>");
		writer.write("</form>");
		writer.write("</body>");
		writer.write("</html>");
		writer.flush();
    }

    /**
     * Initialization of the servlet. <br>
     *
     * @throws ServletException if an error occurs
     */
	@Override
    public void init() throws ServletException {
    	
    }
	
}
