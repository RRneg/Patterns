package structural.Decorator;

public class CatDecorator implements Cat{
    Cat cat;

    public CatDecorator(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String live() {
        return cat.live();
    }
}
