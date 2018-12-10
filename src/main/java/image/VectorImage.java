package image;

import javafx.scene.paint.Color;
import java.util.List;


public class VectorImage implements Image {

    private List<Shape> shapes;
    private int width;
    private int height;

    VectorImage(List<Shape> shapes, int width, int height) {
        this.shapes = shapes;
        this.width = width;
        this.height = height;
    }

    public Color getPixelColor(int x, int y){

    }

    public int getWidth() {return this.width}

    public int getHeight() {return this.height;}

    protected int setWidth(int width) {this.width = width;}

    protected int setHeight(int height) {this.height = height;}
}

