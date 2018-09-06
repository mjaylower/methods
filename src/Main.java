import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("This program will determine the area of a shape");
            System.out.println("-----------------------------------------------");
            System.out.println("Please select the number associated with the");
            System.out.println("given shape to determine it's area");
            System.out.println("1: Triangle");
            System.out.println("2: Square");
            System.out.println("3: Circle");
            System.out.println("4: Rectangle");

            int userInput = scanner.nextInt();

            switch (userInput){
                case 1: triangle();
                    break;
                case 2: square();
                    break;
                case 3: circle();
                    break;
                case 4: rectangle();
            }
        }
        private static void triangle(){

        System.out.println("Area = 1/2(base) * height");
    }
        private static void square(){

        System.out.println("Area = side^2");
    }
        private static void circle(){

        System.out.println("Area = pi * radius^2");
    }
        private static void rectangle(){

        System.out.println("Area = length * width");
    }
          }

