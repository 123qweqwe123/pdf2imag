package com.bdcor.util.pdf2img.convert.Template2Pdf;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.io.FileUtils;
import org.mortbay.io.ByteArrayBuffer;

import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
/**
 * pdf模板转换为pdf
 * @author 韩晓伟
 *
 */
public class PDFTempletStatistics {

	public PDFTempletStatistics() {
		super();
	}

	public byte[] pdfDataBytes(byte[] templateBytes, Map<CharSequence, CharSequence> map) throws Exception {
		 // 通过调用 API的方法读取pdf模板
		PdfReader reader = new PdfReader(templateBytes);

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
        //
		PdfStamper ps = new PdfStamper(reader, bos);
		// 替换模板中的占位符
		AcroFields acroFields = ps.getAcroFields();
		Iterator<Entry<CharSequence, CharSequence>> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<CharSequence, CharSequence> kAndV = iter.next();
			acroFields.setField(kAndV.getKey() + "", kAndV.getValue() + "");
		}
		ps.setFormFlattening(true);
		ps.close();
		byte[] bytes = bos.toByteArray();
		return bytes;

	}
	
	
	public static void main(String[] a) throws Exception{
		byte[] fileData = FileUtils.readFileToByteArray(new File("C:\\Users\\NCRC\\Desktop\\2017\\10\\template.pdf"));

		Map<CharSequence, CharSequence> map = new HashMap<CharSequence, CharSequence>();
		map.put("scanStartDate", "中文");

		PDFTempletStatistics c = new PDFTempletStatistics();
		byte[] out = c.pdfDataBytes(fileData, map);
		FileUtils.writeByteArrayToFile(new File("C:\\Users\\NCRC\\Desktop\\2017\\10\\template_eeeee1.pdf"), out);
	}
}
