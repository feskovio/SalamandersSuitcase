package main;

public class OkkamRoom extends BaseRoom {
    public OkkamRoom(BaseRoom successor) {
        super(OkkamBeast.class);
        this.successor = successor;
    }
    public OkkamRoom() {
        super(OkkamBeast.class);
    }
}
