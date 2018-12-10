package image;
import javafx.scene.paint.Color;
import util.Matrices;

import java.util.List;

public class PaletteRasterImage extends RasterImage {

    private List<Color> palette;

    public PaletteRasterImage(Color color, int width, int height) {
        super(color, width, height);
    }

    public PaletteRasterImage(Color[][] pixels) {
        super(pixels);
    }


    public void setPixelColor(Color color, int x, int y) {
        this.pixels[x][y] = color;
        if(!palette.contains(color))
            palette.add(color);
    }

}
