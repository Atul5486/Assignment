import java.util.Scanner;
class Employee {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter your Age:");
        int age=inp.nextInt();
        System.out.print("Enter your Gender (M or F):");
        char gender=inp.next().charAt(0);
        System.out.print("Are you married or not (Y or N):");
        char status=inp.next().charAt(0);
      
      if(gender=='f' || gender=='F'|| age>40 && age<=60 )
      System.out.println("You will work only in urban areas"); 
      else if(age>=20 && age<=40 )
      System.out.println("You will work anywhere..");
      else
      System.out.println("Error :- Something went worng");
    }
}
