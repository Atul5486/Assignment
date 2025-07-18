import java.util.Scanner;
class Pathway{
    public static void main(String[] args) {
   Scanner inp=new Scanner(System.in);
    System.out.print("Enter length of ground:");//30
    int lenG=inp.nextInt();
    System.out.print("Enter breadth of ground:"); //20
    int breG=inp.nextInt();
    int areaG=lenG*breG;
    System.out.print("Enter path1:");//3
    int path1=inp.nextInt();
    System.out.print("Enter path2:");//4
    int path2=inp.nextInt();
    int pathway1=lenG*path1,pathway2=breG*path2,overlap=path1*path2;
    int pathTotalArea = pathway1 + pathway2 - overlap;
    int usableArea=areaG-pathTotalArea;
    System.out.println("Total Area of garden:"+areaG);
    System.out.println("Total Area of pathway:"+pathTotalArea);
    System.out.println("Usable Area:"+usableArea);
    }
}
