package Homework1;

import java.awt.*;

class PoligonalModel extends ModelElement {
    Texture texture;
    List polygons;

    public PoligonalModel(String name, Texture texture, List polygons) {
        super(name);
        this.texture = texture;
        this.polygons = polygons;
    }
}

