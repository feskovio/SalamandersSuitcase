package rooms;

import animals.LichurkaBeast;

public class LichurkaRoom extends BaseRoom {

    public LichurkaRoom(BaseRoom successor) {
        super(LichurkaBeast.class);
        this.successor = successor;
    }

    public LichurkaRoom() {
        super(LichurkaBeast.class);
    }
}
