import java.util.Scanner;

class program28
{
    public static void main(String A[])
    {
        int iAge = 0;
        float fMarks = 0.0f;
        String sName = null;

        Scanner scanner = null; 

        scanner = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        sName = scanner.next();   // Exception

        System.out.println("Enter You Marks : ");
        fMarks = scanner.nextFloat();

        System.out.println("Enter your Age : ");
        iAge = scanner.nextInt();

        System.out.println("Your Name iS : "+sName);
        System.out.println("Your Age : "+iAge);
        System.out.println("Your Marks is : "+fMarks);

    }
}