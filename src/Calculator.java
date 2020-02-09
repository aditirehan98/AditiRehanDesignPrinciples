import java.util.*;
public class Calculator {
    public void add(int a,int b)
    {
        int c = a+b;
        System.out.println("Sum is: "+c);
    }
    public void subtract(int a,int b)
    {
        int c = a-b;
        System.out.println("Subtraction is: "+c);
    }
    public void multiply(int a,int b)
    {
        int c = a*b;
        System.out.println("Multiplication is: "+c);
    }
    public void division(int a,int b)
    {
        int c = a/b;
        System.out.println("Division is: "+c);
    }
    public static void main(String[]args)
    {
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int n;
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 1 for Multiplication");
        System.out.println("Press 1 for Division");
        boolean exit=false;
        do {
            System.out.println("\nEnter your choice:");
            n=sc.nextInt();

        switch(n) {
            case 1:
                c.add(num1, num2);
                break;
            case 2:
                c.subtract(num1, num2);
                break;
            case 3:
                c.multiply(num1, num2);
                break;
            case 4:
                if (num2 == 0)
                    System.out.println("Error");
                else
                    c.division(num1, num2);
                break;
            case 5:
                exit = true;


        }

        }while(exit!=true);
        System.out.println("Program done!");

    }
}
