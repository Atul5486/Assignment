import java.util.Scanner;
class Note{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter amount:");
        int amount=inp.nextInt();
        if(amount >=500){
        System.out.println("500 RS: "+amount/500);
        amount%=500;
        }
        if(amount>=200){
    System.out.println("200 RS "+amount/200);
    amount %=200;
        }
    if(amount>=100){
    System.out.println("100 RS "+amount/100);
    amount %=100;
        }
    if(amount>=50){
    System.out.println("50 RS "+amount/50);
    amount %=50;
    }
    if(amount>=20){
    System.out.println("20 RS "+amount/20);
    amount %=20;
    }
    if(amount>=10){
    System.out.println("10 RS "+amount/10);
    amount %=10;
    }
    if(amount>=5){
    System.out.println("5 RS "+amount/5);
    amount %=5;
    }if(amount>=2){
    System.out.println("2 RS "+amount/2);
    amount %=2;
    }
    if(amount==1){
    System.out.println("1 RS "+amount/1);
    amount %=1;
    }
        
    }
}

