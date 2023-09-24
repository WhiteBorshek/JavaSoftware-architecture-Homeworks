package Homework1;

import java.util.ArrayList;
import java.util.List;

class Scene {
    String name;
    List<ModelElement> models;

    public Scene(String name) {
        this.name = name;
        this.models = new ArrayList<>();
    }

    public void addModel(ModelElement model) {
        models.add(model);
    }
}

