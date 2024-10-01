public class Fahrenheit extends Temperature {
    
    public Fahrenheit(int value){
        super(value);
    }
    public String toString() {
        return getvalue() + " Degrees Fahrenheit";
    }
    public boolean belowFreezing(){
      return getvalue() < 32;
    }
    public boolean swimmingWeather(){
        return getvalue() >= 80;
    }
}
