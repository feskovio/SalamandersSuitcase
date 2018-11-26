package animals;

public class KomuflorBeast extends FantasticBeast {
    public KomuflorBeast(String name) {
        super(name, 23);
    }

    @Override
    public String speak(){
        return "Komuflor is roaring! ( " + this.getName() + " )";
    }
}
