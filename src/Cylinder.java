public class Cylinder {
    public static double getVolume(int radius , int height){
        double baseArea = getBaseArea(radius);
        double perimater = 2 * Math.PI * radius;
        double volume = perimater * height * 2 * baseArea;
        return volume;
    }

    private static double getBaseArea(int radius) {
        double baseArea = Math.PI * radius * radius;
        return baseArea;
    }
}
