public class Program {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Рыжик", 20),
                new Cat("Васька", 15),
                new Cat("Мурка", 35),
                new Cat("Кузя", 300),
                new Cat("Пушок", 20),
                new Cat("Том", 30)
        };
        Plate plate = new Plate(100);
        eating(cats, plate);
        plate.addFood(50);


    }

    public static void eating(Cat[] cats, Plate plate) {
        int food = plate.getFood();
        for (Cat cat : cats) {
            food = cat.eat(food);
        }
    }
}