package main;

public class OkkamBeast extends FantasticBeast {

    public OkkamBeast(String name) {
        super(name, 37);
    }

    @Override
    public void speak(){
        System.out.println("Okkam is here! ( " + this.getName() + " )");
    }
}

