import java.util.Scanner;
class GrossSalary{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Your basic salary:");
        int salary=inp.nextInt();
        float hra=0,da=0;
        if(salary>0 && salary<=10000){
            hra=salary*20/100;
            da=salary*80/100;
            System.out.println("Gross salary is:"+(hra+da)+ " = " +hra+" and "+da);
        }else if(salary>=10000 && salary<=20000){
            hra=salary*25/100;
            da=salary*90/100;
            System.out.println("Gross salary is:"+(hra+da)+ " = " +hra+" and "+da);
        }else if(salary>20000){
            hra=salary*30/100;
            da=salary*95/100;
            System.out.println("Gross salary is:"+(hra+da)+ " = " +hra+" and "+da);
        }else
        System.out.println("Proper Enter Your salary");
}
}
