package task_2;

import static java.lang.Character.getName;
import java.util.Random;

public class Cat {
    private String name;
    private int satietyLevel;
    private int thistyLevel;

    public Cat(String name, int satietyLevel){
        this.name = name;
        this.satietyLevel = satietyLevel;
        this.thistyLevel = 50;
    }
    public void feed(Food food){
        if (this.satietyLevel + food.getSatyetyValue() >= 84
                && this.satietyLevel+food.getSatyetyValue() <= 90) {
            System.out.println("Ваш кот в отличном состояний PS (от 85кг-90кг");
            System.out.println("EXIT programm");
            return;
        }
        else if (this.satietyLevel+ food.getSatyetyValue() <= 100 && this.thistyLevel+food.getThirstyValue() <=100){
                this.satietyLevel += food.getSatyetyValue();
                this.thistyLevel += food.getThirstyValue();
                System.out.println(this.name + " был(а) покормлен(а) "
                        + food.getName());
                System.out.println(this.thistyLevel + "-Уровень жажды кота");
                System.out.println(this.satietyLevel + "-Уровень сытости кота" );

        }else{
            System.out.println("Ваш кот если поест "+ food.name+" будет  слишком сыт");
            System.out.println("Ваш кот если выпил мг воды "+ food.thirstyValue+" будет  слишком влажным");
            System.out.println("Предложите другое что-то другое");
        }
    }


    public int getSatietyLevel() {
        return satietyLevel;
    }
    public int getThistyLevel(){
        return thistyLevel;
    }
}
