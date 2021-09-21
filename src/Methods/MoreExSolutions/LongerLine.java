import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x3 = Double.parseDouble(scanner.nextLine());
        double y3 = Double.parseDouble(scanner.nextLine());
        double x4 = Double.parseDouble(scanner.nextLine());
        double y4 = Double.parseDouble(scanner.nextLine());

        double lineOneLength = findLongerLine(x1,y1,x2,y2);
        double lineTwoLength = findLongerLine(x3,y3,x4,y4);

        if (lineOneLength >= lineTwoLength) {
            double pointOneToCenter = FindClosestPoint(x1,y1);
            double pointTwoToCenter = FindClosestPoint(x2,y2);
            if (pointOneToCenter <= pointTwoToCenter) {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",x1,y1,x2,y2);
            } else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",x2,y2,x1,y1);
            }

        } else {
            double pointOneToCenter = FindClosestPoint(x3,y3);
            double pointTwoToCenter = FindClosestPoint(x4,y4);
            if (pointOneToCenter <= pointTwoToCenter) {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f",x3,y3,x4,y4);
            } else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",x4,y4,x3,y3);
            }
        }

    }

    private static double FindClosestPoint(double coordinateX, double coordinateY) {

        double distance = Math.sqrt(Math.pow(coordinateX,2) + Math.pow(coordinateY,2));
        return distance;
    }

    private static double findLongerLine(double x1, double y1, double x2, double y2) {

        double result = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        return result;
    }
}
