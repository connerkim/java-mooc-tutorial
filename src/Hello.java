import java.util.Scanner;

public class Hello {
    public static void printSpaces(int number) {
        // you can print one star with the command
        // System.out.print("*");
        // call the print command n times
        // in the end print a line break with the command
        // System.out.println("");
        while (number > 0) {
            System.out.print(' ');
            number--;
        }
    }
    public static void printStars(int number) {
        // you can print one star with the command
        // System.out.print("*");
        // call the print command n times
        // in the end print a line break with the command
        // System.out.println("");
        while (number > 0) {
            System.out.print('*');
            number--;
        }
        System.out.println();
    }
    public static void christmasTree(int size) {
        for (int i = 1; i <= size; i++) {
            int numSpaces = size - i;
            int numStars = i * 2 - 1;
            printSpaces(numSpaces);
            printStars(numStars);
        }
        int trunkWidth = 3;
        for (int i = 0; i < 2; i++) {
            printSpaces(size - 2);
            printStars(trunkWidth);
        }
    }

    public static void main(String[] args) {
        christmasTree(4);
    }
}
