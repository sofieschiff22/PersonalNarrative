import org.code.theater.*;
import org.code.media.*;

public class SceneTwo extends Scene {
    private String[][] myInterests = {
        {"download-(7).jpeg", "My favorite series"},
        {"IMG_5991.jpeg", "My favorite food"},
        {"IMG_1842.jpg", "Beach Volleyball"},
    };

    public void drawScene() {
        for (int i = 0; i < myInterests.length; i++) {
            String fileName = myInterests[i][0];
            String label = myInterests[i][1];

            ImageFilter img = new ImageFilter(fileName);

            // Use String method and compound boolean
            if (fileName.contains("download") || label.contains("Volleyball")) {
                img.applyGrayscale();
            } else {
                img.makeBright();
            }

            clear("black");
            drawImage(img, 0, 0, 400);
            setTextColor("white");
            drawText(label, 20, 380);
            
            pause(5.0); //  5 seconds
        }
    }
}
