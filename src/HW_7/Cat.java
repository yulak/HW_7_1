package HW_7;

public class Cat {
    String name;
    private int amount;
    private int satiety;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
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
        this.satiety = 0;
    }

    public void eat(Plate plate){
        System.out.println(name + " покушал");
        plate.minusFood(amount);
    }
    boolean checkFood(){
        if (satiety >= 0){
            return true;
        }
        return false;
    }
}
