import java.util.Scanner;
class Bill{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter your electricity Bill unit:");
        int unit=inp.nextInt();
        float amount=0;
        if(unit>250){
            amount+=(float)((unit-250)*1.50);
            unit=250;
        }
        if(unit <=250 && unit >150){
            amount+=(float)((unit-150)*1.20);
            unit=150;
        }
        if(unit >50 && unit<=150){
            amount +=(float)((unit-50)*0.75);
            unit=50;
        }
        amount+=unit*0.50;
        float charge=(float)(amount*20/100);
        float total=(float)(amount+charge);
        System.out.println("Your bill after adding subcharges:"+total);
    }
}
