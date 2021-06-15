package structural.Decorator;

public class HouseCat extends CatDecorator{

    public HouseCat(Cat cat) {
        super(cat);
    }

    public String houseCatLife(){
        return "Sleeps all day and eats. ";
    }

    @Override
    public String live() {
        return super.live() + houseCatLife();
    }
}

