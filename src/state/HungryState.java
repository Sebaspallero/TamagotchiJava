package state;

import main.Tamagotchi;
import utils.TamagotchiHelper;

public class HungryState implements TamagotchiState{

    private static int INCREASE_HUNGER = 10;
    private static int DECREASE_HUNGER = 10;

    @Override
    public TamagotchiState play(Tamagotchi tamagotchi) {
        tamagotchi.increaseHunger(INCREASE_HUNGER);
        if (tamagotchi.isDeadByHunger()) {
            TamagotchiHelper.renderDeathByHunger(tamagotchi);
            return new DeadState();
        }
        else if (tamagotchi.isDeadByOverfed()) {
            TamagotchiHelper.renderDeathByOverfed(tamagotchi);
            return new DeadState();
        }
        else{
            TamagotchiHelper.renderPlaying(tamagotchi);
            return this;
        }
    }

    @Override
    public TamagotchiState getFood(Tamagotchi tamagotchi) {
        tamagotchi.decreaseHunger(DECREASE_HUNGER);
        if (tamagotchi.isDeadByOverfed()) {
            TamagotchiHelper.renderDeathByOverfed(tamagotchi);
            return new DeadState();
        }else{
            TamagotchiHelper.renderEating(tamagotchi);
            return new HappyState();
        }  
    }
}
