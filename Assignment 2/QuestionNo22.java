import java.util.Scanner;
class Pond{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       System.out.print("Enter length:"); //50
       int length=inp.nextInt();
       System.out.print("Enter wide:"); //30
       int wide=inp.nextInt();
       System.out.print("Enter deep:"); //2
       int deep=inp.nextInt();
        int volume=length*wide*deep;
        System.out.println("Capacity of pond is :"+volume);
    }
}
