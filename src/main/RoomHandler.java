package main;

import java.util.ArrayList;

abstract class RoomHandler implements SpeakingAnimal {

    protected RoomHandler successor;
    protected ArrayList<FantasticBeast> beasts = new ArrayList<FantasticBeast>();

    public abstract void addResident(FantasticBeast beast);

    public RoomHandler(){}

    public void removeResident(FantasticBeast beast) {
        beasts.remove(beast);
    }

    @Override
    public void speak() {
        for (FantasticBeast beast : beasts) {
            beast.speak();
        }
    }
}
