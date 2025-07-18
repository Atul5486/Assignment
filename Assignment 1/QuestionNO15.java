class Garden{
    public static void main(String[] args) {
       
       int sLength=22;
       int sBreadth=15;
       int rSide=21;
       
       int rGardenArea=rSide*rSide;
       int sGardenArea=sLength*sBreadth;
       int diff=rGardenArea-sGardenArea;
       
       System.out.println("Area of Rachel Garden is :"+rGardenArea);
       System.out.println("Area of shelly Garden is :"+sGardenArea);
       System.out.println("Difference between Rachel and shelly Garden area is :"+diff);
       
    }
}
