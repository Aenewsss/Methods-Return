package thirddioexercise;

import java.util.Scanner;

/*
 * @author Aenã
 */
public class AreaCalc {
    
    private static double area(double side){
        double result = side * side;
        return result;
    }

    private static double area(double base, double height){
        double result = base * height;
        return result;
    }

    private static double area(double majorBase, double minorBase, double height){
        double result = ((majorBase + minorBase) * height)/ 2;
        return result;
    }
    
    public static void areaCalc(){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Lets calculate square area! Enter the side value:");
        double side = keyboard.nextDouble();

        double squareArea = area(side);
        System.out.printf("Square Area = %.2f u.a \n", squareArea);

        System.out.println("Lets calculate rectangle area! Enter base and height value:");
        double base = keyboard.nextDouble();
        double height = keyboard.nextDouble();

        double rectangleArea = area(base, height);
        System.out.printf("Rectangle Area = %.2f u.a \n", rectangleArea);

        System.out.println("Lets calculate trapeze area! Enter major base, minor base and height value:");
        double majorBase = keyboard.nextDouble();
        double minorBase = keyboard.nextDouble();
        double heightT = keyboard.nextDouble();

        double trapezeArea = area(majorBase, minorBase, heightT);
        System.out.printf("Trapeze Area = %.2f u.a \n", trapezeArea);


    }
}
