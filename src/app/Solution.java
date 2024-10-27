package app;

public class Solution {
    public static void main(String[] args) {
        GeometryFigure[] geometryFigures = new GeometryFigure[3];
        geometryFigures[0] = new Circle(5);
        geometryFigures[1] = new Triangle(3, 4, 5);
        geometryFigures[2] = new Square(4);

        for (int i = 0; i < geometryFigures.length; i++) {
            System.out.println("Area " + geometryFigures[i].getClass().getSimpleName() + ": " + geometryFigures[i].getArea());
        }
        System.out.println("Total area of figures: " + calculateTotalArea(geometryFigures));
    }

    public static double calculateTotalArea(GeometryFigure[] geometryFigures) {
        double totalArea = 0;
        for (GeometryFigure geometryFigure : geometryFigures) {
            totalArea += geometryFigure.getArea();
        }
        return totalArea;

    }
}
