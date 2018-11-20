package main;

abstract public class FantasticBeast implements SpeakingAnimal {
    private String name;
    private int foodWeight;

    public FantasticBeast(String name, int foodWeight){
        this.name = name;
        this.foodWeight = foodWeight;
    }

    public String getName(){
        return name;
    }

    public int getFoodWeight(){
        return foodWeight;
    }
}
