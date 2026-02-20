interface Animal {
    void sound();
    void name();
}

abstract class Pet implements Animal {

    // Let child classes implement sound()
    public abstract void sound();

    public void name() {
        System.out.println("This is a pet animal");
    }
}

class Cat extends Pet {

    public void sound() {
        System.out.println("Meow");
    }

    public void name() {
        System.out.println("Cat");
    }
}

public class AnonymousClass {

    public static void main(String[] args) {

        // Normal class object
        Animal cat = new Cat();
        cat.sound();
        cat.name();

        // Anonymous class
        Animal horse = new Animal() {

            public void sound() {
                System.out.println("Neigh");
            }

            public void name() {
                System.out.println("Horse");
            }
        };

        horse.sound();
        horse.name();
    }
}
