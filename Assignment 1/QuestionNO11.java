class Ratio{
    public static void main(String args[]){
        int height=8;
        int base=5;
        int area=320;
        double x = (double)Math.sqrt(area / (0.5 * base * height));
        double actualHeight=(double)(height*x);
        double actualBase=(double)(base*x);
        System.out.println("Height of Triangle is :"+actualHeight);
        System.out.println("Base of Triangle is :"+actualBase);
        
    }
}
