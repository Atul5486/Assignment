import java.util.Scanner;
class Pool{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       System.out.print("Enter side:");//150
       int side=inp.nextInt();
       int area=side*side;
       System.out.print("Enter Pool Side:");//25
    int poolSide=inp.nextInt(),poolArea=poolSide*poolSide;
    int gardenArea=area-poolArea;
    System.out.println("Total Area of garaden:"+gardenArea);
    }
}
