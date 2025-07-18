import java.util.Scanner;
class Alphabet {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a character:");
        int ch=inp.next().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
        System.out.println("This is an alphabet ");
        else
        System.out.println("This is not an alphabet");
    }
}
