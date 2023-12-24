import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C://Users//aizad//IdeaProjects//assignment//src//source");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        for (String s : Arrays.asList("perimetr:" + shape.calculatePerimeter(), "longest:" + shape.getLongestSide(), "average:" + shape.getSides())) {
            System.out.println(s);
        }

    }
}