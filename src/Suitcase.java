import java.util.ArrayList;

public class Suitcase extends RoomHandler implements SpeakingAnimal{

    private RoomHandler baseRoom;
    private TimeOfDayState timeOfDayState = new DayState();

    public void toggleDayTime(){
        this.timeOfDayState.Handle(this);
    }

    public TimeOfDayState getTimeOfDayState() {
        return timeOfDayState;
    }

    public void setTimeOfDayState(TimeOfDayState timeOfDayState){
        this.timeOfDayState = timeOfDayState;
    }

    @Override
    public void addResident(FantasticBeast beast) {
        if(this.baseRoom != null) {
            this.baseRoom.addResident(beast);
        }
    }

    public Suitcase(){

    }

    public Suitcase(BaseRoom baseRoom){
        this.baseRoom = baseRoom;
    }

    private ArrayList<FantasticBeast> getBeasts(){
        ArrayList<FantasticBeast> fantasticBeasts = new ArrayList<FantasticBeast>();
        RoomHandler roomHandler = baseRoom;
        while (roomHandler != null) {
            for (FantasticBeast beast : roomHandler.beasts) {
                fantasticBeasts.add(beast);
            }
            roomHandler = roomHandler.successor;
        }
        return fantasticBeasts;
    }

    private int getBeastsCount(){
        return getBeasts().size();
    }

    @Override
    public void speak() {
        if(getTimeOfDayState() instanceof DayState) {
            for (FantasticBeast beast : this.getBeasts()) {
                beast.speak();
            }
        }
    }

    public void callByName(String name){
        for (FantasticBeast beast : this.getBeasts()) {
            if(beast.getName().equals(name)) {
                beast.speak();
            }
        }
    }

    public int getTotalFoodWeight(){
        int totalWeight = 0;
        for (FantasticBeast beast : this.getBeasts()) {
            totalWeight += beast.getFoodWeight();
        }
        return totalWeight;
    }

    public double getAvgWeight(){
        return getTotalFoodWeight() / getBeastsCount();
    }

    public void selfEnter(){
        double rand = Math.random();
        String randName = "Name " + String.valueOf(rand);
        if(rand < 0.4) {
            this.addResident(new LichurkaBeast(randName));
        } else if(rand < 0.8 && rand >= 0.4) {
            this.addResident(new KomuflorBeast(randName));
        } else {
            this.addResident(new OkkamBeast(randName));
        }
    }
}
