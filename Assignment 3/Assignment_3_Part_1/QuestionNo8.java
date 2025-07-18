import java.util.Scanner;
class AttendMedical{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of classes you attneded:");
        int attend=inp.nextInt();
        int held=200;
        float attendInPer=(float)(attend*100/held);
        System.out.print("If you have any medical cause Enter 'y' and 'n':");
        char cause=inp.next().charAt(0);
        if(attendInPer >100){
            System.out.println("Enter Correct attended class.");
        }else{
        if(cause=='y' || (attendInPer >=75) && (attendInPer<=100) )
            System.out.println("You are eligible for exam. Your attendence in percent is:"+attendInPer);
        else
        System.out.println("You are not eligble for exam Your attendence in percent is:"+attendInPer+"%");
        }
        
    }
}
