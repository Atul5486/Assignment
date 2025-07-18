import java.util.Scanner;
class Grade{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter your marks between(1 to 100) :");
        int num=inp.nextInt();
        if(num>0 && num<=100){
            if(num<60)
            System.out.println("Grade is D");
            else if(num>=60 && num<=80)
            System.out.println("Grade is C");
            else if(num>80 && num<=90)
            System.out.println("Grade is B ");
            else if(num>90)
            System.out.println("Grade is A ");
            else
            System.out.println("Not match");
        }else{
            System.out.println("Enter number between 1 to 100..");
        }
    }
}
