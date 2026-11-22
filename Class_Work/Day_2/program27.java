import java.util.Scanner;

class program27
{
    public static void main(String A[])
    {
        int iAge = 0;
        String sName = null;
        float fMarks = 0.0; //Error

        Scanner scanner = null;

        scanner = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        sName = scanner.next();

        System.out.println("Enter Your Age : ");
        iAge = scanner.nextInt();

        System.out.println("Enter your Marks : ");
        fMarks = scanner.nextFloat();

        System.out.println("Your Name is : " +sName);
        System.out.println("you are Age is : "+iAge);
        System.out.println("you are age  : "+fMarks);
    }
}