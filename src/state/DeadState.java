package state;

import main.Tamagotchi;

public class DeadState implements TamagotchiState{

    @Override
    public TamagotchiState play(Tamagotchi tamagotchi) {
        return this;
    }

    @Override
    public TamagotchiState getFood(Tamagotchi tamagotchi) {
       return this;
    }

}
