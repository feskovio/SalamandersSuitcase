/**
 * Created by alexander.feskov on 11/19/2018.
 */
public class KomuflorRoom extends BaseRoom {
    public KomuflorRoom(BaseRoom successor) {
        super(KomuflorBeast.class);
        this.successor = successor;
    }
    public KomuflorRoom() {
        super(KomuflorBeast.class);
    }
}
