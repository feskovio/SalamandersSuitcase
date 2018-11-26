package rooms;

import animals.FantasticBeast;
import animals.SpeakingAnimal;

import java.util.ArrayList;

public abstract class RoomHandler implements SpeakingAnimal {

    public RoomHandler successor;
    public ArrayList<FantasticBeast> beasts = new ArrayList<FantasticBeast>();

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
