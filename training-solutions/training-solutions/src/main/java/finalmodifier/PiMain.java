package finalmodifier;

public class PiMain {

    public static void main(String[] args) {
        CircleCalculator circleCalculator = new CircleCalculator();
        CylinderCalculator cylinderCalculator = new CylinderCalculator();
        CylinderCalculatorBasedOnCircle cylinderCalculatorBasedOnCircle = new CylinderCalculatorBasedOnCircle();
        double r = 5.0;
        double h = 20.0;
        double circlePerimeter;
        double circleArea;
        double cylinderSurface;
        double cylinderVolume;
        double cylinderSurfaceBasedOnCircle;
        double cylinderVolumeBasedOnCircle;

        circlePerimeter = circleCalculator.calculatePerimeter(r);
        circleArea = circleCalculator.calculateArea(r);

        cylinderSurface = cylinderCalculator.calculateSurfaceArea(r, h);
        cylinderVolume = cylinderCalculator.calculateVolume(r, h);

        cylinderSurfaceBasedOnCircle = cylinderCalculatorBasedOnCircle.calculateSurfaceArea(r, h);
        cylinderVolumeBasedOnCircle = cylinderCalculatorBasedOnCircle.calculateVolume(r, h);

        System.out.println("Pi is: " + CircleCalculator.PI);
        System.out.println("r is: " + r + ", h is: " + h);
        System.out.println();
        System.out.println("Perimeter of the circle: " + circlePerimeter);
        System.out.println("Area of the circle: " + circleArea);
        System.out.println();
        System.out.println("Surface of the cylinder: " + cylinderSurface);
        System.out.println("Volume of the cylinder: " + cylinderVolume);
        System.out.println();
        System.out.println("Surface of the cylinder based on circle calculation: " + cylinderSurfaceBasedOnCircle);
        System.out.println("Volume of the cylinder based on circle calculation: " + cylinderVolumeBasedOnCircle);
    }
}