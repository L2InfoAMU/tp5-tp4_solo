package image;
import javafx.scene.paint.Color;

public  class BruteRasterImage extends RasterImage {

    public BruteRasterImage(Color color, int width, int height) {
        super(color, width, height);
    }

    public BruteRasterImage(Color[][] pixels) {
        super(pixels);
    }

    public void setPixelColor(Color color, int x, int y) {
        this.pixels[x][y] = color;
    }

    
}
