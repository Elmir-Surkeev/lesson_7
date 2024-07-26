package task_2;

public class Food {
    public String name;
    private int satyetyValue;
    public int thirstyValue;
    public Food(String name, int satyetyValue, int thirstyValue){
        this.name = name;
        this.satyetyValue = satyetyValue;
        this.thirstyValue = thirstyValue;
    }
    public int getSatyetyValue(){
        return satyetyValue;
    }
    public String getName(){
        return name;
    }
    public int getThirstyValue(){
        return thirstyValue;
    }
}
