import java.util.Scanner;
class Equitlateral{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter size:"); //12
        int size=inp.nextInt();
        float a=(float)(Math.sqrt(3)/4*size*size);
        System.out.println(a);
    }
}
