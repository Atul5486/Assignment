import java.util.Scanner;
class Leap {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a year:");
        int year=inp.nextInt();
        if(year % 4 == 0)
        System.out.println("Its a leap year!!");
        else
        System.out.println("It's not a leap year");
        
    }
}
