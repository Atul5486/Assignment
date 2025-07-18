class RightAngleTriangle {
    public static void main(String[] args) {
       int h=13;
       int p=12;
       int l=(int)(Math.sqrt((h*h)-(p*p)));
       double area=(double)(0.5*p*l);
       System.out.println("Length of Triangle: "+l);
       System.out.println("Area of right Angle Triangle:"+area);
       
    }
}
