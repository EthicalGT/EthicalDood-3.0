import java.awt.Desktop;
import java.net.URI;

public class user_forum{
    public static void main(String[] args) {
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(new URI("http://localhost:8080/ED%203.0/userforum.jsp"));
                }
            } else {
                System.out.println("not supported");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
