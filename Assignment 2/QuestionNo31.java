import java.util.Scanner;
class Square{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       System.out.print("Enter Perimeter:");//  200
       int perimeter=inp.nextInt();
       int side=perimeter/4,area=side*side;
    System.out.println("Area of Square is :"+area);
    }
}
