class CylinderVolume {
    public static void main(String[] args) {
        int radius = 10;
        int volume = 1287;
        float height =(float) (volume / (Math.PI * radius * radius));
        float surfaceArea =(float) (2 * Math.PI * radius * height + 2 * Math.PI * radius * radius);

        System.out.println("Surface Area of cylinder is: " + surfaceArea);
    }
}
