package behavioral.Visitor;

public class Solution {
    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        Mathematics geometry = new Geometry();
        Mathematics analisis = new MathematicalAnalysis();

        System.out.println("Решение методами геометрии");
        exercise.calculate(geometry);

        System.out.println();

        System.out.println("Решение методами математического анализа");
        exercise.calculate(analisis);
    }
}