import java.util.Scanner;
class Temperature {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter c for celcius to faherenheit");
        System.out.print("Enter f for faherenheit to celcius:");
        int ch = inp.next().charAt(0);
        System.out.print("Enter temperature: ");
        float temp = inp.nextFloat(); 
        float c=0,f=0;
        
        if(ch=='c'|| ch=='C'){
        c=(float)((temp - 32) * 5/9) ;
        System.out.println("Fahrenheit to celsius: " + c);
        } else{
        f=(float)((temp * 9/5) + 32) ;
        System.out.println("Celsius to Fahrenheit is :"+f);
        }

    }
}
