public class Fahrenheit extends Temperature {
    
    public Fahrenheit(int value){
        super(value);
    }
    public abstract String toString() {
        return getValue() + " Degrees Fahrenheit";
    }
    public abstract boolean belowFreezing(){
      return getvalue() < 32;
    }
    public abstract boolean swimmingWeather(){
        return getvalue() >= 80;
    }
}
