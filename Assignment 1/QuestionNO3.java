class Tile{
    public static void main(String args[]){
        int length=7;
        int breadth=13;
        int areaOfTile=length*breadth;
        int rectLength=520;
        int rectBreadth=140;
        int rectArea=rectLength * rectBreadth;
        int totalTile=rectArea/areaOfTile;
        System.out.println("Total Area: "+rectArea);
        System.out.println("Area of tile: "+areaOfTile);
        System.out.println("Total Number of Tiles Needed: "+totalTile);
    }
}
