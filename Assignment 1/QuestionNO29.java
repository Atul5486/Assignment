class FloorTile{
    public static void main(String[] args) {
      int len=800,wide=900;
      int floorArea=len*wide;
      int tileSide=10,tileArea=tileSide*tileSide;
      
      int totalTiles=floorArea/tileArea;
      System.out.println("Total no of tiles required :"+totalTiles);
    }
}

