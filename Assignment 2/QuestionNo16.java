mport java.util.Scanner;
class TinaTable{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       System.out.print("Enter length:"); //5
       int length=inp.nextInt();
       System.out.print("Enter Breadth:"); //7
      int breadth=inp.nextInt();
      int totalLengthCarpet=length*breadth;
      System.out.println("Tina need Total carpet to cover her dinning table is :"+totalLengthCarpet);
    }
}
