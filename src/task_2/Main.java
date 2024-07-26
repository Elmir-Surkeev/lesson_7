package task_2;

import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cat name");
        String catName = scanner.nextLine();
        Random random = new Random();
        int max = 100;
        int min = 50;
        int randomNumber = random.nextInt(((max-min)+1)+min);
        Cat cat = new Cat(catName, randomNumber );

        Food fish = new Food("Рыба", 18, -5);
        Food corm = new Food("Корм", 23, 10);
        Food meat = new Food("Мясо", 14, 0);
        Food water = new Food("Вода", -10, -15);

        while (true){
            if (randomNumber >= 85){
                System.out.println("Вашему коту пора сесть на диету");
                return;
            }
            System.out.println("Уровень изначальной сытости равен " + randomNumber);
            System.out.println("Чем мы будем кормить кота на вечер");
            System.out.println("Мы будем кормить кота на вечер рыбой №1");
            System.out.println("Мы будем кормить кота на вечер кормом №2");
            System.out.println("Мы будем кормить кота на вечер мясом №3");
            System.out.println("Дать попить воды -10 к сытости, -15 к жажде №4");
            System.out.println("Exit №5");
            int choice = scanner.nextInt();
            scanner.close();
            switch (choice){
                case 1:
                    cat.feed(fish);
                    break;
                case 2:
                    cat.feed(corm);
                    break;
                case 3:
                    cat.feed(meat);
                    break;
                case 4:
                    cat.feed(water);
                    break;
                case 5:
                    System.out.println("Exit in kitchen");
                    break;
                default:
                    System.out.println("Неверный выбор попроговать еще раз");

            }
        }
    }
}
