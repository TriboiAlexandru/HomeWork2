package classes.kinder;

public class KinderDemo {
    public static void main(String[] args) {
        Kinder Marry = new Kinder("Marry", "Brown", 2.5, "Girl");
        Kinder Mark = new Kinder ("Mark", "Blond", 3, "Boy");
        Kinder John = new Kinder("John", "Brunet", 3, "Boy");

        Marry.run();
        Mark.jump();
        John.sleep();

    }
}
