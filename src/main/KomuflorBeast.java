package main;

public class KomuflorBeast extends FantasticBeast {
    public KomuflorBeast(String name) {
        super(name, 23);
    }

    @Override
    public void speak(){
        System.out.println("Komuflor is roaring! ( " + this.getName() + " )");
    }
}
