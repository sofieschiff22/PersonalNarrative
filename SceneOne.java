import org.code.theater.*;
import org.code.media.*;

public class SceneOne extends Scene {

  /* 
   * 2D Array stores the data for the visualization:
   * Column 0: Image filename
   * Column 1: Relationship/Context label
   */
  private String[][] myStory = {
    {"IMG_6189.jpeg", "My Friends"},
    {"JKC00127.JPEG", "My Teammates"},
    {"IMG_1666.JPG", "My Family"},
    {"IMG_0310.JPG", "My Siblings"},
    {"IMG_3155-(1).jpeg", "My favorite sunset from Hawaii"},
    {"IMG_7393.JPEG", "A rainbow I saw in Hawaii"}
  };

  /**
   * Draws the personal narrative by iterating through the image data.
   */
  public void drawScene() {
    for (int i = 0; i < myStory.length; i++) {
      String fileName = myStory[i][0];
      String label = myStory[i][1];

      ImageFilter img = new ImageFilter(fileName);

      /* 
       * ALGORITHM: Uses String methods and compound Boolean expressions
       * to decide which mood filter to apply based on the description.
       */
      if (label.contains("Sunset") || label.contains("Beach")) {
        img.applyGoldenHour(); // Enhance the warmth for nature shots
      } else {
        img.makeBright();      // Keep people shots clear and bright
      }

      // Visualization logic
      clear("white");
      drawImage(img, 0, 0, 400);
      
      // Text styling for the narrative
      drawStyle(); 
      drawText(label, 20, 370);

      // Display each for 7 seconds
      pause(5.0);
    }
  }

  /* Helper to keep text style consistent */
  private void drawStyle() {
    setTextHeight(25);
    setTextColor("black");
    // Draw a small background rectangle for text readability
    setFillColor("white");
    drawRectangle(0, 340, 400, 60);
  }
}
