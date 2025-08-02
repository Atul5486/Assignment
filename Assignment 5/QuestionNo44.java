import java.util.Scanner;
class Interchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
       if(num < 0 && num >-10){
       System.out.println("Entered Digit is single");
       }
       int last=num%10,first=num,power=1;
       while(first >=10 || first <=-10){
           first/=10;
           power*=10;
       }
       int middle=(num%power)/10;
       int swap = last * power + middle * 10 + first;
       System.out.println("Number after swaping first and last digit : "+swap);
        
    }
}