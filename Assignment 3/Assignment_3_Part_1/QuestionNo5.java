import java.util.Scanner;
class Age{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter age of 1st person:");
        int age1=inp.nextInt();
        System.out.print("Enter age of 2nd person:");
        int age2=inp.nextInt();
        System.out.print("Enter age of 3rd person:");
        int age3=inp.nextInt();
        
        if(age1==age2 || age2==age3 || age3==age1){
            System.out.println("Age of any two person is same");
        }else{
        if(age1>age2 &&age1>age3)
        System.out.println("1st person is older");
        else if(age2 >age1 && age2>age3)
        System.out.println("2nd person is older");
        else
        System.out.println("3rd person is older");
        }
        
        if(age1==age2 || age2==age3 || age3==age1){
            System.out.println("Age of any two person is same");
        }else{
        if(age1<age2 &&age1< age3)
        System.out.println("1st person is younger");
        else if(age2 < age1 && age2< age3)
        System.out.println("2nd person is younger");
        else
        System.out.println("3rd person is younger");
        }
        
        
    }
}
