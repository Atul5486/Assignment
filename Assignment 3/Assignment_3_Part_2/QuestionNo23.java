import java.util.Scanner;
class Week{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=inp.nextInt();
        if(num>0 && num<=7){
            if(num==1)
            System.out.println("Monday");
            else if(num==2)
            System.out.println("Tuesday");
            else if(num==3)
            System.out.println("Wednesday");
            else if(num==4)
            System.out.println("Thusday");
            else if(num==5)
            System.out.println("Friday");
            else if(num==6)
            System.out.println("Satarday");
            else
            System.out.println("sunday");
        }else{
            System.out.println("Enter number between 1 to 7..");
        }
    }
}

