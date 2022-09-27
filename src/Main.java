import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String name = "";
        String trash = "";
        int age = 0;
        double salary = 0;

        System.out.print("Enter your name: ");
        name = in.nextLine();

        System.out.println("You said your name is "+name);

        System.out.print("Enter your age: ");
        age = in.nextInt();

        if(in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine(); //MUST CLEAR BUFFER AFTER READING A NUMBER
            System.out.println("You said your age is "+age);
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash+"is not a valid number");
        }
        System.out.println("You said your age is "+age);

        System.out.println("Enter your salary");
        if(in.hasNextDouble())
        {
            salary = in.nextDouble();
            in.nextLine(); //MUST CLEAR BUFFER AFTER READING A NUMBER
            System.out.println("You said the salary is "+salary);
        }
        else
        {
           trash = in.nextLine();
           System.out.println(trash +" is not a number");
        }
    }
}