class Trapezoid{
    public static void main(String[] args) {
   int base1= 128,base2 =92,height = 40;
   float areaOfTrapezoid=(float)((base1+base2)*height)/2;
   
   int lenWalkAway=height,widthWalkAway=4,walkAwayArea=lenWalkAway*widthWalkAway;
   float woodArea=(float)(areaOfTrapezoid-walkAwayArea);
   
    System.out.println("Area of Trapezoid:"+areaOfTrapezoid);
    System.out.println("Area of WalkAway:"+walkAwayArea);
    System.out.println("Area of wood:"+woodArea);
    
    }
}
