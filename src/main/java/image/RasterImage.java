package image;

import javafx.scene.paint.Color;
import util.Matrices;

import java.util.List;

public abstract class RasterImage implements Image{

    protected Color[][] pixels;
    private int width;
    private int height;

    public abstract void setPixelColor(Color color, int x, int y);

    public RasterImage(Color color, int width, int height){
        this.width = width;
        this.height = height;

        createRepresentation();
        setPixelsColor(color);
    }

    public RasterImage(Color[][] pixels) {
        Matrices.requiresNonZeroDimensions(pixels);
        Matrices.requiresNonNull(pixels);
        setWidth(pixels.length);
        setHeight(pixels[0].length);
        createRepresentation();
        this.pixels = pixels;
    }

    public void createRepresentation() {
        pixels = new Color[getHeight()][getWidth()];
    }

    public Color getPixelColor(int x, int y) {return pixels[x][y];}

    private void setPixelsColor(Color[][] pixels) {this.pixels = pixels;}

    private void setPixelsColor(Color color) {
        for (int y = 0; y < getWidth(); y++)
            for (int x = 0; x < getHeight(); x++)
                setPixelColor(color, x, y);
    }

    public int getWidth() {return this.width;}

    public int getHeight() {return this.height;}

    protected void setWidth(int width) {this.width = width;}

    protected void setHeight(int height) {this.height = height;}


}

