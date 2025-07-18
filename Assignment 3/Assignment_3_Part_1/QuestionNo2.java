import java.util.Scanner;
class Discount{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter total unit:");
        int  unit=inp.nextInt();
        int price=unit*100;
        if(price>=1000){
            float discount=(float)(price/10);
            price-=discount;
            System.out.println("Your total bill after discount is "+price);
        }else{
            System.out.print("Please buy more something to get discount atleast 1000");
        }
        
    }
}
