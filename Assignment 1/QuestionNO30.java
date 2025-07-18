class BedRoom{
    public static void main(String[] args) {
     int len=200,wide=400;
      int floorArea=len*wide;
      int tileLen=5,tileBre=8,tileArea=tileLen*tileBre;
      
      int totalTiles=floorArea/tileArea;
      System.out.println("Total no of tiles required :"+totalTiles);
    }
}
