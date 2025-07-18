class Triangle{
    public static void main(String args[]){
        int a=10;
        int b=9;
        int perimeter=36;
        int c=perimeter-a-b;
        int s=(a+b+c)/2;
        double area=Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println(area);
    }
}
