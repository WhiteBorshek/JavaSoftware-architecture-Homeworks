package Homework3;

/*
Принцип подстановки Барбары Лисков (Liskov Substitution Principle - LSP)
LSP гласит, что объекты базового класса должны быть заменяемыми объектами производного класса
без изменения правильности программы.
*/
public class LSP {
    class Bird {
        void fly() {
            System.out.println("I can fly");
        }
    }

    class Penguin extends Bird {
        void fly() {
            throw new UnsupportedOperationException("I can't fly");
        }
    }
}
