import java.util.Scanner;
public class Alphabet {
    public static void main(String[] args) {
       Scanner inp=new Scanner(System.in);
       System.out.print("Enter case of alphabet in ( U and L) : ");
       char ch=inp.nextLine().toLowerCase().charAt(0);
       switch(ch){
           case 'u': for(char alpha='A';alpha<='Z';alpha++){
               System.out.print(alpha + " ");
           }
           break;
           case 'l': for(char alpha='a';alpha<='z';alpha++){
               System.out.print(alpha + " ");
           }
           break;
           default:System.out.println("Only enter L and U ..");
       }
}