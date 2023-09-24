package Homework1;

import java.awt.*;

class Poligon extends ModelElement {
    List vertices;

    public Poligon(String name, List vertices) {
        super(name);
        this.vertices = vertices;
    }
}