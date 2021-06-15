package structural.Decorator;

public class BritishHouseCat extends CatDecorator {
    public BritishHouseCat(Cat cat) {
        super(cat);
    }

    public String britishHouseCatLife(){
        return "Thinks people around are nothing.";
    }

    @Override
    public String live() {
        return super.live() + britishHouseCatLife();
    }
}
