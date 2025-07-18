import java.util.Scanner;
class Grade{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter marks of physics:");
        int physics=inp.nextInt();
        System.out.print("Enter marks of maths:");
        int maths=inp.nextInt();
        System.out.print("Enter marks of chemistry:");
        int chemistry=inp.nextInt();
        System.out.print("Enter marks of biology:");
        int biology=inp.nextInt();
        System.out.print("Enter marks of computer:");
        int computer=inp.nextInt();
        int total=physics+maths+biology+chemistry+computer;
        float percent=(float)(total/5.0);
        System.out.println("Your Percentage is :"+percent);
        if(percent >90 && percent <=100)
        System.out.println("Grade is: A");
        else if(percent >80 && percent <=90)
        System.out.println("Grade is: B");
        else if(percent >70 && percent <=80)
        System.out.println("Grade is: C");
        else if(percent >60 && percent <=70)
        System.out.println("Grade is: D");
        else if(percent >50 && percent <=60)
        System.out.println("Grade is: E");
        else
        System.out.println("Fail");
    }
}
