package animals;

public class LichurkaBeast extends FantasticBeast {

    public LichurkaBeast(String name) {
        super(name, 20);
    }

    @Override
    public String speak(){
        return "Lichurka speaking! ( " + this.getName() + " )";
    }
}
