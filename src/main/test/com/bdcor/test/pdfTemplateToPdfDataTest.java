
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import com.bdcor.util.pdf2img.client.Template2PdfClient;
import com.bdcor.util.pdf2img.convert.pdfbox.CustomPageDrawer;


public class pdfTemplateToPdfDataTest {
	@Test
	public void pdfTemplateToPdfData()throws Exception{
	Map<CharSequence, CharSequence> map = new HashMap<CharSequence, CharSequence>();
	map.put("scanStartDate", "1");
	map.put("scanEndDate", "2");
	map.put("totalPersons", "3");
	map.put("totalTubes", "4");
	map.put("comparedRatio", "5");
	map.put("exceptionMessages", "6");
	map.put("minorityMessages", "7");
	map.put("Matchingpersons", "8");
	map.put("misMatchingpersons", "9");
	map.put("matchingRatio", "11");
	map.put("minorityExceptionMessages", "12");
	map.put("purpleRatio", "13");
	map.put("whiteRatio", "14");
	map.put("grayRatio", "15");
	map.put("yellowRatio", "16");
	map.put("averRatio", "17");
	map.put("recycleSampleStartDate", "11");
	map.put("recycleSampleEndDate", "12");
	map.put("recycleTotalPersons", "21");
	map.put("recycletotalTubes", "22");
	map.put("recycle3TotalPersons", "23");
	map.put("recycle3totalTubes", "24");
	map.put("recycle2TotalPersons", "25");
	map.put("recycle2totalTubes", "26");
	map.put("scanTotalPersons", "27");
	map.put("scantotalTubes", "28");
	map.put("scan3TotalPersons", "29");
	map.put("scan3totalTubes", "33");
	map.put("scan2TotalPersons", "34");
	map.put("scan2totalTubes", "35");

	String ip = "172.31.33.120";
	Template2PdfClient client = new Template2PdfClient(ip, null);
	ByteBuffer bytes = client.convert(new File("src/main/test/template.pdf"), map);
	int i = 0;
	FileUtils.writeByteArrayToFile(new File("img_" + i + ".pdf"), bytes.array());
	i++;
}

}

