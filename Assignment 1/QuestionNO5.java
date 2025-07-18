class Park{
    public static void main(String args[]){
        int length=20;
        int rate=25;
        int total=1600;
        float area=(float)(total/rate);
        float breadth=(float)(area/length);
        float perimeter=(float)(2*(length+breadth));
        System.out.println("Breadth of Park in meter is : "+breadth);
        System.out.println("Perimeter of Park is : "+perimeter);
        System.out.println("Area of Park in meter square is : "+area);
    }
}
