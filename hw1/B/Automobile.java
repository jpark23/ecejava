public class Automobile {
    private int vin;
    private float miles;
    private String last; // last = date of the last maintanence 

    public String getDate() {
        String str = ""+month+"/"+date+"/"+year+;
        return str;
    }

    /* constructor */
    public void setter(int _vin, float _miles, int _month, int _date, int _year) {
        vin = _vin;
        miles = _miles;
        month = _month;
        date = _date;
        year = _year;
    }
}