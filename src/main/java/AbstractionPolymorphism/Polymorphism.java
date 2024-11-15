package AbstractionPolymorphism;

class Shape {

    public double area(double length, double width) {
        return length * width;
    }

    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public double area(int side) {
        return side * side;
    }
}

class Mainnn {
    public static void main(String[] args) {
        Shape shape = new Shape();

        double rectangleArea = shape.area(5.0,4.0);
        System.out.println(rectangleArea);

        double circleArea = shape.area(3.0);
        System.out.println(circleArea);

        double triangleArea = shape.area(4);
        System.out.println(triangleArea);
    }
}