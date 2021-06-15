package behavioral.Visitor;

public class Exercise implements MathematicalActions{
    MathematicalActions[] mathematicalActions;

    public Exercise() {
        this.mathematicalActions = new MathematicalActions[]{
                new Pi(),
                new AreaOfCircle()
        };
    }

    @Override
    public void calculate(Mathematics mathematician) {
        for (MathematicalActions action: mathematicalActions) {
            action.calculate(mathematician);
        }
    }
}
