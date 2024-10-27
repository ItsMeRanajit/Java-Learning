abstract class animal {
    animal() {
        System.out.println("hey its an animal");
    }

    abstract void sound();

    public void legs() {
        System.out.println("animal have legs");
    }

    public void tail() {
        System.out.println("many animals have tail");
    }
}

class horse extends animal {
    horse() {
        System.out.println("hey im a horse");
    }

    horse(String name) {
        System.out.println("this horse's name is " + name);
    }

    public void sound() {
        System.out.println("horse makes sound");
    }
}

class horsefarm extends horse {
    horsefarm() {
        System.out.println("here horses stay");
    }
}

public class constructorChaining {
    public static void main(String a[]) {
        horse h = new horse();
        h.legs();
        h.tail();
        h.sound();
        horse t = new horse("Badal");
        horsefarm tk = new horsefarm();
    }
}
// concept chaining is a concept where if we use inheritance then for the obj of
// child the parent classes constructor will be always called 1st then the child
// constructor...
// if there is mutilevel inheritance then it calls all the constructor
