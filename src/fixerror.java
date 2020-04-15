import java.util.Scanner;

public class fixerror {
    public static void main(String[] args){
        String  name;
        int age;
        int birth_year;


        Scanner input=new Scanner(System.in);
        System.out.println("Input your name: ");
        name=input.nextLine();
        System.out.print("Enter your age: " );
        age=input.nextInt();
        System.out.print("Enter your DOB year: ");
        birth_year=input.nextInt();
        System.out.println("Summary: "+"Your name is: "+name+"\n"+"Your age is: "+age+"\n"+"Your birth year is: "+birth_year);


    }
}
