import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {
    public ImageFilter(String fileName) {
        super(fileName);
    }

    public void applyGoldenHour() {
        Pixel[][] pixels = getImagePixels();
        // Fix: row < height, col < width
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[0].length; col++) {
                Pixel p = pixels[row][col];
                if (p.getRed() > 10 && p.getGreen() > 10) {
                    p.setRed(Math.min(255, (int)(p.getRed() * 1.25)));
                    p.setGreen(Math.min(255, (int)(p.getGreen() * 1.1)));
                }
            }
        }
    }

    public void applyGrayscale() {
        Pixel[][] pixels = getImagePixels();
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[0].length; col++) {
                Pixel p = pixels[row][col];
                int avg = (p.getRed() + p.getGreen() + p.getBlue()) / 3;
                p.setRed(avg);
                p.setGreen(avg);
                p.setBlue(avg);
            }
        }
    }

    public void makeBright() {
        Pixel[][] pixels = getImagePixels();
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[0].length; col++) {
                Pixel p = pixels[row][col];
                p.setRed(Math.min(255, p.getRed() + 30));
                p.setGreen(Math.min(255, p.getGreen() + 30));
                p.setBlue(Math.min(255, p.getBlue() + 30));
            }
        }
    }
}
