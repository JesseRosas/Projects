public class Celsius extends Temperature {
    
    public Celsius(int value){
        super(value);
    }
    public String toString() {
        return getvalue() + " Degrees Celsius";
    }
    public boolean belowFreezing(){
      return getvalue() < 0;
    }
    public boolean swimmingWeather(){
        return getvalue() >= 27;
    }
}