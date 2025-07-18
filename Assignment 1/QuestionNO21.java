
class WallAndBrick{
    public static void main(String args[]){
        int length=15,breadth=8,height=5;
        int wallLength=15*100,wallHeight=10*100,wallBreadth=8*100;
        int volumeOfWall=wallLength*wallHeight*wallBreadth;
        int volumeOfBrick=length*height*breadth;
        int numberofBricks=volumeOfWall/volumeOfBrick;
        System.out.println(volumeOfWall);
        System.out.println(volumeOfBrick);
        System.out.println(numberofBricks);
    }
}
