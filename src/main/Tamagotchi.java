package main;

import state.HappyState;
import state.TamagotchiState;

public class Tamagotchi {
    
    private static final int MAX_HUNGER = 100;
    private static final int MIN_HUNGER = 0;

    private String name;
    private int hunger;
    private TamagotchiState currentState;

    //CREATE INSTANCE
    private static Tamagotchi instance;

    //MAKE THE CONSTRUCTOR PRIVATE - SINGLETON - 
    private Tamagotchi(String name){
        this.name = name;
        hunger = 50;
        currentState = new HappyState();
    }

    //GET INSTANCE OF THE TAMAGOTCHI CLASS
    public static Tamagotchi createTamagotchi(String name){
        if(instance == null) {
            instance = new Tamagotchi(name);
        }
        return instance;
    }

    // ACTIONS
    public void play(){
        this.currentState = this.currentState.play(this);
    }

    public void eat(){
        this.currentState = this.currentState.getFood(this);
    }

    //CHANGE HUNGER VALUES

    public void increaseHunger(int amout){
        this.hunger = Math.max(MIN_HUNGER, this.hunger - amout);
    }

    public void decreaseHunger(int amout){
        this.hunger = Math.min(MAX_HUNGER, this.hunger + amout);
    }

    //CHECK IF TAMAGOTCHI IS DEAD BY HUNGER OR OVERFED

    public boolean isDeadByHunger(){
        return this.hunger == MIN_HUNGER;
    }

    public boolean isDeadByOverfed(){
        return this.hunger == MAX_HUNGER;
    }


    //SETTERS Y GETTERS
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    
    public int getHunger() {
        return hunger;
    }

    public String getName() {
        return name;
    }

    public TamagotchiState getCurrentState() {
        return currentState;
    }
    
}
