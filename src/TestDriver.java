public class TestDriver {
    public static void main(String[] args) {
        Fahrenheit tempF = new Fahrenheit(65);
        Celsius tempC = new Celsius(-2);

        System.out.println(tempF.belowFreezing());
        System.out.println(tempF.swimmingWeather);
        System.out.println(tempF.toString);

        System.out.println(tempC.belowFreezing());
        System.out.println(tempC.swimmingWeather);
        System.out.println(tempC.toString);
    }
}
