import java.util.Scanner;
class Bike{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Price of bike:");
        int price=inp.nextInt();
        int tax=0;
            if(price>100000){
            tax=15;
            float roadTax=(float)(price*tax/100);
            float priceRoad=price+roadTax;
            System.out.println("The price of bike after road tax is :"+priceRoad);
            }else if(price>50000 && price<=100000){
            tax=10;
            float roadTax=(float)(price*tax/100);
            float priceRoad=price+roadTax;
            System.out.println("The price of bike after road tax is :"+priceRoad);
            }else if(price<=50000){
            tax=5;
            float roadTax=(float)(price*tax/100);
            float priceRoad=price+roadTax;
            System.out.println("The price of bike after road tax is :"+priceRoad);
            }else
            System.out.println("Enter correct Price..");
    }
}
