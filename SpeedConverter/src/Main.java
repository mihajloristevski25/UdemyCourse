public class Main {
    public static void main(String[] args) {
        SpeedConverter.printConversion(2.4);
        long round = SpeedConverter.toMilesPerHour(1.3);
        System.out.println("Converted is " + round);
    }
}
