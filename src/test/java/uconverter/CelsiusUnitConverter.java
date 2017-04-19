package uconverter;

/**
 * Created by javaCourses on 19.04.2017..
 */
public class CelsiusUnitConverter extends UnitConverter {
    @Override
    public double toSI(double value) {
        return value + 273.15 ;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue - 273.15;
    }

    @Override
    public String getName() {
        return "Celsius";
    }
}
