public class FightSong {
    public static void main(String[] args){
        methodSpace();
        methodRepeat();
        methodRepeat();
        methodGo();
    }

    public static void methodGo() {
        System.out.println("Go, team, go!");
        System.out.println("You can do it.");
    }

    public static void methodSpace() {
        methodGo();
        System.out.println();
    }

    public static void methodYou() {
        System.out.println("You're the best,");
        System.out.println("In the West.");
    }

    public static void methodRepeat() {
        methodGo();
        methodYou();
        methodSpace();
    }
}