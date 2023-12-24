package models;

import java.util.ArrayList;

public class Shape {
    // container of Points (e.g. ArrayList<Point>)
    private ArrayList<Point> points;

    public double Shape() {
        this.points = new ArrayList < > ();
        return 0;
    }


        public double calculatePerimeter() {
            double perimeter = 0;
            for (int i = 0; i < points.size() - 1; i++) {
                perimeter += points.get(i).getDistance(points.get(i + 1));
            }
            perimeter += points.get(points.size() - 1).getDistance(points.get(0));
            return perimeter;
        }

        public double getLongestSide() {
            double LongestSide = 0;
            for (int i = 0; i < points.size() - 1; i++) {
                double side = points.get(i).getDistance(points.get(i + 1));
                if (LongestSide < side) {
                    LongestSide = side;
                }
            }
            double LastSide = points.get(points.size() - 1).getDistance(points.get(0));
            if (LastSide > LongestSide) {
                LongestSide = LastSide;
            }
            return LongestSide;
        }

        public double getSides() {
            double sum = 0;
            for (int i = 0; i < points.size() - 1; i++) {
                sum += points.get(i).getDistance(points.get(i + 1));
            }
            sum += points.get(points.size() - 1).getDistance(points.get(0));
            return sum / points.size();
        }

    public void addPoint(Point point) {
        point.addPoint(point);
    }
}





