import java.awt.*;

public class Display {
    int width, height;
    boolean fullscreen;
    // int resolution;
    // int refreshRate;

    public Display() {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        width = (int) size.getWidth();
        height = (int) size.getHeight();
        fullscreen = false;
    }

    // Returns width depending on fullscreen
    public int getWidth(){
        if(fullscreen)
            return width;
        else
            return width / 2;
    }

    // Returns width depending on fullscreen
    public int getHeight(){
        if(fullscreen)  
            return height;
        else 
            return height / 2;
    }
}