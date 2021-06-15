package behavioral.Visitor;

public class Geometry implements Mathematics{
    @Override
    public void compute(Pi pi) {
        System.out.println("Нахождение числа Пи. Отношение длины окружности к ее диаметру");
    }

    @Override
    public void compute(AreaOfCircle areaOfCircle) {
        System.out.println("Нахождение площади круга. Произведение числа Пи и квадрата радиуса");
    }
}
