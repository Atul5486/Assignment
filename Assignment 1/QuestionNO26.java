class PathLay{
    public static void main(String[] args) {
      int len=24,bre=15;
      int area=len*bre;
      System.out.println("Area of one Brick :"+area);
        int lenPath=120*100;
        float brePath=(float)(2.4*100);
        float pathArea=(float)(lenPath*brePath);
        float numberOfBricks=(float)(pathArea/area);
        System.out.println("Area of path is :"+numberOfBricks);
    }
}
