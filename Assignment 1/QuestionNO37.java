class CylinderSurface{
    public static void main(String[] args) {
  int height=6,area=149;
  float diameter=(float)(2*(Math.sqrt(height*height+2*(area/Math.PI))-height)/2);
  System.out.println("Diameter of cylinder is :"+diameter);
    }
}
