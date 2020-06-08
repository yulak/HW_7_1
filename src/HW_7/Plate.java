package HW_7;

public class Plate {
    int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    /*
     * метод уменьшает количество еды в тарелке нa
     * @param anount количество уменьшаемой еды
     * и @return возвращает true, если удалось уменьшить
     * @false если не удалось(получилось число >0)
     * */
    public boolean minusFood(int amount) { //

        if (food < amount) {
            return false;
        } else {
            food -= amount;
            return true;
        }
    }

    public void infoFood() {
        System.out.println("Еды осталось: " + food);
    }

    public void affFood(int amount) {
        food += amount;
    }
}
