
public class BaseRoom extends RoomHandler {

    private Class beastType;

    public BaseRoom(Class beastType){
        this.beastType = beastType;
    }

    @Override
    public void addResident(FantasticBeast beast) {
        if(beastType.equals(beast.getClass())) {
            this.beasts.add(beast);
        } else {
            if(this.successor != null) {
                this.successor.addResident(beast);
            }
        }
    }
}
