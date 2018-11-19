
public class KomuflorRoom extends BaseRoom {
    public KomuflorRoom(BaseRoom successor) {
        super(KomuflorBeast.class);
        this.successor = successor;
    }
    public KomuflorRoom() {
        super(KomuflorBeast.class);
    }
}
