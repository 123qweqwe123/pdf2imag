package org.dgl.imgstopdf;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

public class PicToBinary {  
  
    public static void main(String[] args) throws IOException {  
        /** 
         * PDF单页转化为图片输出 注意：英文或图片类的PDF可转化，中文抛异常 
         */  
        PDDocument doc;  
        try {  
            doc = PDDocument.load(new File("test.pdf"));  
            /*
            PDPageTree pages = doc.getDocumentCatalog().getPages();  
            Iterator<PDPage> pageIter = pages.iterator();
            while(pageIter.hasNext()){  
                PDPage page = pageIter.next();  
                page
                BufferedImage image = page.convertToImage();  
  
                File file = new File("c:\\pdf_to_jpg_test.jpg");  
                ImageIO.write(image, "jpg", file);  
            } 
            */
            PDFRenderer renderer = new PDFRenderer(doc);
            int pageCount = doc.getNumberOfPages();
            for(int i=0;i<pageCount;i++){
            BufferedImage image = renderer.renderImage(i, 36); // Windows native DPI
           // BufferedImage srcImage = resize(image, 240, 240);//产生缩略图
            ImageIO.write(image, "jpg", new File("E:\\com.jpg"));
            }
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
  
    }  
  
}  