import java.util.List;
import java.util.ArrayList;
class Toy {
    private String name;
    private int costInKopecks;
    private int minAge;
    private int maxAge;

    // Додайте поля для інших властивостей іграшок (розмір, кількість, вага, кількість конструкцій)

    public Toy(String name, int costInKopecks, int minAge, int maxAge) {
        this.name = name;
        this.costInKopecks = costInKopecks;
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    // Додайте геттери та сеттери для інших властивостей іграшок

    public String getName() {
        return name;
    }

    public int getCostInKopecks() {
        return costInKopecks;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }
}

public class Main {
    public static void main(String[] args) {
        // Створюємо список для зберігання іграшок
        List<Toy> toys = new ArrayList<>();

        // Додавання іграшок до списку (використовуємо окремі поля для віку)
        toys.add(new Toy("Кубики", 150, 2, 5));
        toys.add(new Toy("Кубики", 180, 1, 3));
        toys.add(new Toy("Лялька", 220, 3, 7));
        toys.add(new Toy("М'яч", 120, 2, 5));
        toys.add(new Toy("Конструктор", 250, 4, 10));

        int maxCostInKopecks = 200;
        int minAge = 2;

        // Виводимо перелік підходящих кубиків
        System.out.println("Перелік кубиків, що підходять дитині " + minAge + " років з вартістю до " + maxCostInKopecks + " грн:");

        for (Toy toy : toys) {
            if (toy.getName().equals("Кубики") && isAgeInRange(toy.getMinAge(), toy.getMaxAge(), minAge) && toy.getCostInKopecks() <= maxCostInKopecks) {
                System.out.println("Назва: " + toy.getName() + ", Вартість: " + toy.getCostInKopecks() + " копійок");
            }
        }
    }

    // Метод для перевірки, чи вік підходить за вказаним діапазоном
    private static boolean isAgeInRange(int minAge, int maxAge, int age) {
        return age >= minAge && age <= maxAge;
    }
}
