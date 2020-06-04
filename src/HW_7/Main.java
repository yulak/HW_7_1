package HW_7;

public class Main {

    public static void main(String[] args) {
        Cat[ ] cat = new Cat[3];
        cat[0] = new Cat("Котя", 20);
        cat[1] = new Cat("Муся", 15);
        cat[2] = new Cat("Дуся", 10);
        Plate plate = new Plate(100);

            /*for (Cat i : cat){
                if (i.getSatiety() == 0){
                    i.eat(plate);

                    System.out.println(i.getName() + " покушал");
                }
            }*/

        cat[0].eat(plate);
        cat[1].eat(plate);
        cat[2].eat(plate);
        //plate.infoFood();



    }
}
