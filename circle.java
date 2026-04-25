import java.util.Scanner;

class Circle {
    double radiusInMm;

    Circle(double radiusInMm) {
        this.radiusInMm = radiusInMm;
    }

    double getCircumference() {
        return 2 * radiusInMm * Math.PI;

    }

    double getArea() {
        return Math.PI * Math.pow(radiusInMm, 2);
    }

    @Override
    public String toString() {
        return "Circle props: Radius in mm: " + radiusInMm + ", circumference in mm: " + getCircumference()
                + ",Area inmm2: " + getArea();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome");
        System.out.println("enter radius");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle);

    }
}