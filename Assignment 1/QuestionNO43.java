class CylinderVolumeDiameterAnother{
    public static void main(String[] args) {
        int h=4,l=5,rate=10;
        float r=(float)(Math.sqrt(l*l-h*h));
        float area=(float)(Math.PI*r*r);
        float totalPrice=area*rate;
        
  System.out.println("Total cost polishing the base of a cone :"+totalPrice);
    }
}
