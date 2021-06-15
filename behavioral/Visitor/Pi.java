package behavioral.Visitor;

public class Pi implements MathematicalActions{
    @Override
    public void calculate(Mathematics mathematician) {
mathematician.compute(this);
    }
}
