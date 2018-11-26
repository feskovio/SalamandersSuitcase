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
    public String speak() {
        StringBuilder messages = new StringBuilder();
        for (FantasticBeast beast : beasts) {
            messages.append(beast.speak()).append("\n");
        }
        return messages.toString();
    }
}
