package WhileExercises;

public class WhileDemo {
    public static void main(String[] args) {
        boolean bunsAviable = true;
        int totalBuns=40;
        int numberOfBurgers=1;

        while (bunsAviable){
            if (totalBuns==0)
                bunsAviable=false;
            System.out.println("Praparing burger"+(numberOfBurgers+1));
            --totalBuns;
            System.out.println("placing the burger");
            System.out.println("Placing the ceese");
            System.out.println("Placing the pickles");
            System.out.println("Placing tomates");
            System.out.println("Placing the salad");
            --totalBuns;
            if (totalBuns==0)
                bunsAviable=false;
            else
                numberOfBurgers++;
            System.out.println("Burger is prepared \n");

        }
        System.out.println("Prepared"+numberOfBurgers+ "burgers");
        System.out.println("Remaning Buns ="+totalBuns);
    }

}
