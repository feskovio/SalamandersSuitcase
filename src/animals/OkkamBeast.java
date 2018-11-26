package animals;

public class OkkamBeast extends FantasticBeast {

    public OkkamBeast(String name) {
        super(name, 37);
    }

    @Override
    public String speak(){
        return "Okkam is here! ( " + this.getName() + " )";
    }
}

