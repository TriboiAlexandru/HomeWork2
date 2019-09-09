package classes.kinder;

public class Kinder {
    public static final String TYPE_OF_HUMAN = "Kinder";

    private String name = "Unknown";
    private String hairColor;
    private double ageInYars;
    private String gender;

    {
        System.out.println("A new baby comes to Kindergarten");
    }

////    public KinderGarten() {
////        this("Unknown", "Unknown", 0, "");
//
//    }

    public Kinder(String name) {
        this(name, "Brown", 2.5, "girl");

    }

    public Kinder(String name, String hairColor, double ageInYars, String gender) {
        this.name = name;
        this.hairColor = hairColor;
        this.ageInYars = ageInYars;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        return;

    }

    public String getColor() {
        return hairColor;
    }

    public void setColor() {
        this.hairColor = hairColor;
    }

    public double getAgeInYars() {
        return ageInYars;
    }

    public void setAgeInYars() {
        this.ageInYars = ageInYars;
    }
    public String getGender() {
        return gender;
    }

    public void setGender() {
        this.gender = gender;
    }

    public void jump() {
        System.out.println(name + "jumping...");
    }

    public void run() {
        System.out.println(name + "running...");
    }

    public void sleep() {
        System.out.println(name + "sleeping...");
    }


//    //    OVERRIDING
//    @Override
//    public String toString() {
//        return "Unicorn{name=" +
//                this.name + ", + color = " +
//                this.ageInYars + "}";
//    }
//}

}
