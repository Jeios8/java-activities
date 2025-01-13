package chapter6;

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            System.out.println("put gorilla food into cage");
            return true;
        }
        return false;
    }

    @Override
    public void groom() {
        System.out.println("lather, rinse, repeat");
    }

    @Override
    public void pet() {
        System.out.println("pet at your own risk");
    }

    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        System.out.println("Feeding the gorilla: " + gorilla.feed(true));
        gorilla.groom();
        gorilla.pet();
    }
}