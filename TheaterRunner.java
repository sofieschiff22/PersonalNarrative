import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {
    
    // 1. Instantiate the scenes
    SceneOne scene1 = new SceneOne();
    SceneTwo scene2 = new SceneTwo();

    // 2. Execute the draw logic for each scene
    scene1.drawScene();
    scene2.drawScene();

    // 3. Play the animation
    Theater.playScenes(scene1, scene2);
  }
}
