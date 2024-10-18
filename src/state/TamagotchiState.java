package state;

import main.Tamagotchi;

public interface TamagotchiState {

    public TamagotchiState play(Tamagotchi tamagotchi);
    public TamagotchiState getFood(Tamagotchi tamagotchi);
}
