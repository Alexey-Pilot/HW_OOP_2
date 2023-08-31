public class Cat{
    private final String name;
    private final int appetite;

    public boolean satiety;

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public int eat(int food) {
        if(appetite > food){
            System.out.printf("Кот %s голоден, в миске осталось %d еды", name, food);
            System.out.println();
            return food;
        }else{
            System.out.printf("Кот %s сыт, в миске осталось %d еды", name, (food - appetite));
            System.out.println();
            this.satiety = true;
            return food - appetite;
        }
    }

}
