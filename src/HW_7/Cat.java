package HW_7;

public class Cat {
    String name;
    private int amount;
    private boolean satiety;

    {
        satiety = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Cat(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void eat(Plate plate){
        System.out.println(name + " покушал");
        if (plate.minusFood(amount)){
            satiety = true;
        }else {
            System.out.println(name + " не покушал");
        }
    }
    /*boolean checkFood(){
        if (satiety >= 0){
            return true;
        }
        return false;
    }*/
}
