/**
 * Created by alexander.feskov on 11/19/2018.
 */
public class OkkamRoom extends BaseRoom {
    public OkkamRoom(BaseRoom successor) {
        super(OkkamBeast.class);
        this.successor = successor;
    }
    public OkkamRoom() {
        super(OkkamBeast.class);
    }
}
