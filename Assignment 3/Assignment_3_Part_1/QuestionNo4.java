import java.util.Scanner;
class Marks{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter your marks:");
        int  marks=inp.nextInt();
        if(marks <=25)
        System.out.println("Grade is :F");
        else if(marks >25 && marks<=45)
        System.out.println("Grade is :E");
        else if(marks >45 && marks<=50)
        System.out.println("Grade is :D");
        else if(marks >50 && marks<=60)
        System.out.println("Grade is :C");
        else if(marks >60 && marks<=80)
        System.out.println("Grade is :B");
        else if(marks >80 && marks<=100)
        System.out.println("Grade is :A");
        else
        System.out.print("Enter Your marks between 1 to 100");
        
    }
}
