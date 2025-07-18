class HalfDiameter{
    public static void main(String[] args) {
  int diameter=15,height=7;
  double halfDiameter=diameter/2.0;
  float area=(float)(2*Math.PI*halfDiameter*height+2*Math.PI*halfDiameter*halfDiameter);
  System.out.println("Surface Area of cylinder is :"+area);
    }
}
