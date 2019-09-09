package classes.unicorn;

public class Unicorn {
    public static final String TYPE_OF_ANIMAL = "Mythic";

    private String name = "Unknown";
    private String color;
    private int ageInYars;

    {
        System.out.println("An unicorn is being born");
    }

    public Unicorn(){
        this("Unknown", "Unknown", 0);

    }
    public Unicorn(String name){
        this(name, "Pink", 1001);
//        this.name=name;
//        this.color="Pink";
//        this.ageInYars = 1001;
    }

    public Unicorn(String name, String color, int ageInYars) {
        this.name= name;
        this.color=color;
        this.ageInYars = ageInYars;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        return;

    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public int getAgeInYars() {
        return ageInYars;
    }

    public void setAgeInYars() {
        this.ageInYars = ageInYars;
    }

    public void fly() {
        System.out.println(name + "flying...");
    }

    public void run() {
        System.out.println(name + "running...");
    }

    public void executeSuperpower(String superpower) {
        System.out.println(name + "executing <" + superpower + ">");
    }

    public void executeSuperpower(String superpower, int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            executeSuperpower(superpower);
        }
    }

    //    OVERRIDING
    @Override
    public String toString() {
        return "Unicorn{name=" +
                this.name + ", + color = " +
        this.ageInYars + "}";
    }
}

