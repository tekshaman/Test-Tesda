interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {
    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            // put gorilla food into cage
            System.out.println("Gorilla is being fed.");
            return true;
        }
        return false;
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Gorilla is being groomed.");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Petting the gorilla.");
    }
}

public class Task16 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}