package Homework1;

import java.util.ArrayList;
import java.util.List;

class ModelStore {
    List<ModelElement> models;

    public ModelStore() {
        this.models = new ArrayList<>();
    }

    public void addModel(ModelElement model) {
        models.add(model);
    }
}

