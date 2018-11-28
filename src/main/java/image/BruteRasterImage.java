package image;
import javafx.scene.paint.Color;
import util.Matrices;

public  class BruteRasterImage implements Image {

    private Color[][] colors;
    private Color color;
    private int width;
    private int height;

    public BruteRasterImage(Color color, int width, int height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public BruteRasterImage(Color[][] colors) {
        Matrices.requiresNonZeroDimensions(colors);
        Matrices.requiresNonNull(colors);
        this.colors = colors;
    }

    public void createRepresentation() {
        colors = new Color[getHeight()][getWidth()];
        setPixelsColor(color);
    }

    public void setPixelColor(Color color, int x, int y) {
        this.color = color;
        this.width = x;
        this.height = y;
    }

    public Color getPixelColor(int x, int y) {return colors[y][x];}

    private void setPixelsColor(Color[][] pixels) {this.colors = pixels;}

    private void setPixelsColor(Color color) {
        for (int y = 0; y < getWidth(); y++)
            for (int x = 0; x < getHeight(); x++)
                setPixelColor(color, y, x);
    }

    public int getWidth() {return this.width;}

    public int getHeight() {return this.height;}

    protected void setWidth(int width) {this.width = width;}

    protected void setHeight(int height) {this.height = height;}

    
}
