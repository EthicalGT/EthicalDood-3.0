import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.*;
class plagiarism {
	public static void main(String[] args) {
		try{
			File f=new File("Week 1.pdf");
			PDDocument doc=PDDocument.load(f);
			PDFTextStripper strip=new PDFTextStripper();
			String text=strip.getText(doc);
			System.out.println(text);
			doc.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}