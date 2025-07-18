import java.util.Scanner;
class Vowel{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a alphabet letter:");
        char ch=inp.next().toLowerCase().charAt(0);
        switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
               default:
                    System.out.println("Not a vowel");
            }
    }
}
