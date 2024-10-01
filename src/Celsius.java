public class Celsius extends Temperature {
    
    public Fahrenheit(int value){
        super(value);
    }
    public abstract String toString() {
        return getValue() + " Degrees Celsius";
    }
    public abstract boolean belowFreezing(){
      return getvalue() < 0;
    }
    public abstract boolean swimmingWeather(){
        return getvalue() >= 27;
    }
}