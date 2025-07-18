import java.util.Scanner;
class Ratio{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Heigth:"); //8
        int height=inp.nextInt();
        System.out.print("Enter Base:"); //5
        int base=inp.nextInt();
        System.out.print("Enter Area:"); //320
        int area=inp.nextInt();
        double x = (double)Math.sqrt(area / (0.5 * base * height));
        double actualHeight=(double)(height*x);
        double actualBase=(double)(base*x);
        System.out.println("Height of Triangle is :"+actualHeight);
        System.out.println("Base of Triangle is :"+actualBase);
    }
}
