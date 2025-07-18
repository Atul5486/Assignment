import java.util.Scanner;
class DogPark{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       System.out.print("Enter length:"); //50
       int len=inp.nextInt();
       System.out.print("Enter Breadth:"); //30
      int bre=inp.nextInt();
      int perimeter=2*(len+bre);
     int round=10;
        float distance=(float)(perimeter*round)/1000;
        System.out.println("Ron jogs Covers :"+distance+"km");
    }
}
