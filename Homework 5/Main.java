package Homework5.Main;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Здесь можно создать объекты компонентов и начать работу с ними
        EditingBlock editingBlock = new EditingBlock();
        ViewingBlock viewingBlock = new ViewingBlock();
        ModelCreationBlock modelCreationBlock = new ModelCreationBlock();
        Rendering rendering = new Rendering();
        Conversion conversion = new Conversion();
        ModelLoader modelLoader = new ModelLoader();
        ModelSaver modelSaver = new ModelSaver();

        // Далее можно использовать эти объекты для взаимодействия с различными частями системы
        // Например:
        rendering.renderScene();
        modelLoader.loadModel("example.obj");
        editingBlock.editModel();
        modelSaver.saveModel("modified_model.obj");
    }
}

