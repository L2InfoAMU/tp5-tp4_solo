package image;
import javafx.scene.paint.Color;
import util.Matrices;

public  class BruteRasterImage implements Image {

    private Color[][] colors;
    private int width;
    private int height;

    public BruteRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;

        createRepresentation();
        setPixelsColor(color);
    }

    public BruteRasterImage(Color[][] colors) {
        Matrices.requiresNonZeroDimensions(colors);
        Matrices.requiresNonNull(colors);
        setWidth(colors.length);
        setHeight(colors[0].length);
        createRepresentation();
        this.colors = colors;
    }

    public void createRepresentation() {
        colors = new Color[getWidth()][getHeight()];
    }

    public void setPixelColor(Color color, int x, int y) {
        this.colors[x][y] = color;
    }

    public Color getPixelColor(int x, int y) {return colors[x][y];}

    private void setPixelsColor(Color[][] pixels) {this.colors = pixels;}

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
