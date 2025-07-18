import java.util.Scanner;
class Attend{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of classes you attended:");
        int attend=inp.nextInt();
        int held=200;
        float attendInPer=(float)(attend*100/held);
        if(attendInPer >100){
            System.out.println("Enter Correct attended class.");
        }else{
        if(attendInPer >=75 && attendInPer<=100 )
            System.out.println("You are eligible for exam. Your attendence in percent is:"+attendInPer);
        else
        System.out.println("You are not eligble for exam Your attendence in percent is:"+attendInPer+"%");
        }
        
    }
}
