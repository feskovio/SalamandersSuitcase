
public class LichurkaBeast extends FantasticBeast {

    public LichurkaBeast(String name) {
        super(name, 20);
    }

    @Override
    public void speak(){
        System.out.println("Lichurka speaking! ( " + this.getName() + " )");
    }
}
