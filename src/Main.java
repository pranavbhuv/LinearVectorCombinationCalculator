import java.util.Scanner;
import Jama.Matrix;

class Main
{
    public static void main(String[] args) {
        doStuff();
    }

    public static void doStuff() {

        System.out.println("\nInput Vectors from the format <a, b> to the format \"a,b\".");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.print("\nVector Coordinate Pair 1: ");
        String vector1 = myObj.nextLine();
        String[] vector1array = vector1.split(",");
        System.out.println("Vector 1 Inputted: <" + vector1array[0] + "," + vector1array[1] + ">");

        System.out.print("\nVector Coordinate Pair 2: ");
        String vector2 = myObj.nextLine();
        String[] vector2array = vector2.split(",");
        System.out.println("Vector 2 Inputted: <" + vector2array[0] + "," + vector2array[1] + ">");

        System.out.print("\nTarget Coordinate Pair: ");
        String target = myObj.nextLine();
        String[] targetarray = target.split(",");
        System.out.println("Target Inputted: <" + targetarray[0] + "," + targetarray[1] + ">");

        double [][] lhside = {{Double.parseDouble(vector1array[0]), Double.parseDouble(vector2array[0])}, {Double.parseDouble(vector1array[1]), Double.parseDouble(vector2array[1])}};
        double[] rhside = {Double.parseDouble(targetarray[0]), Double.parseDouble(targetarray[1])};
        Matrix lhs = new Matrix(lhside);
        Matrix rhs = new Matrix(rhside, 2);
        Matrix ans = lhs.solve(rhs);

        System.out.println("\n-----------------------\nEquation: " + (ans.get(0, 0)) + "u + " + (ans.get(1, 0)) +"v\n-----------------------");

        doStuff();
    }
}
