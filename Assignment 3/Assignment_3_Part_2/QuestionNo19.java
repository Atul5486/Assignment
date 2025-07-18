import java.util.Scanner;
class Triangle{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter first side:");
        int side1=inp.nextInt();
        System.out.print("Enter second side:");
        int side2=inp.nextInt();
        System.out.print("Enter third side:");
        int side3=inp.nextInt();
        if(side1 == side2 && side2 == side3){
        System.out.println("It is a equilateral triangle");
       return ;
        } 
        if(side1 == side2 || side2 == side3 || side3 == side1) {
        System.out.println("It is a isosceles triangle");
        return;
        }
        if(side1!=side2 && side2!=side3 && side3!=side1){
        System.out.println("It is a Scalene triangle");
        return;
        } 
        
    }
}
