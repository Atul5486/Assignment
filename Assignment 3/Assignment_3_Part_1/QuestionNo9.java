import java.util.Scanner;
class Alpha{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter any single character:");
        char ch=inp.next().charAt(0);
        if(ch>='a'&&ch<='z')
        System.out.println("Character in Lowercase...");
        else if(ch>='A'&& ch<='Z')
        System.out.println("Character in upperCase...");
        else
        System.out.println("Enter a letter...");
    }
}
