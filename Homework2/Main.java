package Homework2;

public class Main {
    public static void main(String[] args) {
        ItemFabric generator = new GoldGenerator();
        generator.openRewgard();

        generator = new GemGenerator();
        generator.openRewgard();
    }
}
