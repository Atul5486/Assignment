import java.util.Scanner;
class Percentage {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Total marks:");
        float totalMarks=inp.nextFloat();
        System.out.print("Enter Total marks obtained by Student:");
        float marks=inp.nextFloat();
        float percent=(float)(marks*100/totalMarks);
        System.out.println(percent);
    }
}
