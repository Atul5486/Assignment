import java.util.Scanner;
class ProfitLose{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Cost price:");
        int cost=inp.nextInt();
        System.out.print("Enter selling price:");
        int sell=inp.nextInt();
        if(cost > sell){
        int lose=cost -sell;
        System.out.println("Lose:"+lose);
        }else if(cost < sell){
        int profit=sell-cost;
        System.out.println("Profit:"+profit);
        }else{
         System.out.println("No profit or no lose");   
        }
        
    }
}
