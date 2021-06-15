package behavioral.Visitor;

public class AreaOfCircle implements MathematicalActions{
    @Override
    public void calculate(Mathematics mathematician) {
mathematician.compute(this);
    }
}
