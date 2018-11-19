/**
 * Created by alexander.feskov on 11/19/2018.
 */
public class OkkamBeast extends FantasticBeast {

    public OkkamBeast(String name) {
        super(name, 37);
    }

    @Override
    public void speak(){
        System.out.println("Okkam is here! ( " + this.getName() + " )");
    }
}

