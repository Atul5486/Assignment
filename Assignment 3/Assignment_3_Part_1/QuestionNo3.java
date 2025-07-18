import java.util.Scanner;
class Bonus{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Service in years:");
        int  service=inp.nextInt();
        if(service>=5){
            System.out.print("Enter Your Salary:");
        float salary=inp.nextFloat();
            float bonus=(float)(salary/20);
            salary=salary+bonus;
            System.out.println("Congratulation you get bonus and now your salary is :"+salary);
        }else{
            System.out.print("Sorry you not get any bonus | please serve atleat 5 year to get bonus");
        }
        
    }
}
