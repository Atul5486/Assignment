import java.util.Scanner;
class Sign {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=inp.nextInt();
        if(num >0)
        System.out.println("+ve");
        else if(num <0)
        System.out.println("-ve");
        else
        System.out.println("Neutral");
    }
}
