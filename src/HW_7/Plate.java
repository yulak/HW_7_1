package HW_7;

public class Plate {
    int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }
    void minusFood(int amount){
        food -= amount;
        if (food < 0){
            System.out.println("Еды не хватает на всех");
        }else {
            System.out.println("Еды осталось: " + food);
        }
    }

    /*public void infoFood(){
        System.out.println("Еды осталось: " + food);
    }*/
}
