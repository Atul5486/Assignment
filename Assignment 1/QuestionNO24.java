class PriceOfBricks {
    public static void main(String[] args) {
      int lenB=25,wideB=10;
      float thickB=7.5f;
      int lenW=20*100,highW=2*100;
      float thickW=0.75f*100;
      float volumeW=(float)(lenW*highW*thickW);
      float volumeB=(float)(lenB*wideB*thickB);
      
      float totalBrick=(float)(volumeW/volumeB);
      System.out.println("Total Number of Bricks :"+totalBrick);
      int price=900;
      float totalPriceOfBricks=(float)(price*totalBrick/1000);
      System.out.println("Price of Total Bricks :"+totalPriceOfBricks);
        
    }
}
