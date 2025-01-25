import java.util.*;
import java.util.stream.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.*;

public class comparer {
    public static void main(String[] args) {
        try (PDDocument doc = PDDocument.load(new File("ED.pdf"));
             FileReader reader = new FileReader("ED.txt")) {
            
            PDFTextStripper strip = new PDFTextStripper();
            String text = strip.getText(doc);
            //System.out.println(text);
            List<String> pdftxt = new ArrayList<>();
            pdftxt.add(text);
            
            List<String> edtxt = new ArrayList<>();
            int data;
            while ((data = reader.read()) != -1) {
                edtxt.add(String.valueOf((char) data));
            }

            double match = calculate(pdftxt, edtxt);

            if (match >= 90) {
                System.out.println("Plagiarism detected.");
            } else {
                System.out.println("Plagiarism not detected.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static double calculate(List<String> pdftxt, List<String> edtxt) {
        String extracted = pdftxt.stream().collect(Collectors.joining()).replaceAll("\\s", "").toLowerCase();
        String matching = edtxt.stream().collect(Collectors.joining()).replaceAll("\\s", "").toLowerCase();

        int totalch = Math.max(extracted.length(), matching.length());
        int matchch = 0;

        for (int i = 0; i < Math.min(extracted.length(), matching.length()); i++) {
            if (extracted.charAt(i) == matching.charAt(i)) {
                matchch++;
            }
        }

        return ((double) matchch / totalch) * 100;
    }
}
