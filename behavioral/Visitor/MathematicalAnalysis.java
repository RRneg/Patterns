package behavioral.Visitor;

public class MathematicalAnalysis implements Mathematics{
    @Override
    public void compute(Pi pi) {
        System.out.println("Нахождение числа Пи. Предел суммы ряда Лейбница");
    }

    @Override
    public void compute(AreaOfCircle areaOfCircle) {
        System.out.println("Нахождение площади круга. Интеграл по четверти сегмента круга умноженный на 4");
    }
}
