class Pathway{
    public static void main(String[] args) {
    int lenG=30,breG=20,areaG=lenG*breG;
    int pathway1=lenG*3,pathway2=breG*4,overlap=3*4;
    int pathTotalArea = pathway1 + pathway2 - overlap;
    int usableArea=areaG-pathTotalArea;
    System.out.println("Total Area of garden:"+areaG);
    System.out.println("Total Area of pathway:"+pathTotalArea);
    System.out.println("Usable Area:"+usableArea);
    }
}
