import java.util.Scanner;
class Box{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter volume:"); //3
        int volume1=inp.nextInt();
        System.out.print("Enter carton Volume 1:"); //15
        int carVolume1=inp.nextInt();
        System.out.print("Enter carton Volume 2:"); //9
        int carVolume2=inp.nextInt();
        System.out.print("Enter carton Volume 3:"); //12
        int carVolume3=inp.nextInt();
        int volumeOfOne=volume1*volume1*volume1;
        int cartonVolume=carVolume1*carVolume2*carVolume3;
        int totalbox=cartonVolume/volumeOfOne;
        
        System.out.println("Boxes Required :"+totalbox);
        
    }
}
