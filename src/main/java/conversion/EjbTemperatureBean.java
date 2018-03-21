package conversion;

import javax.ejb.Stateless;

@Stateless(name = "EjbTemperatureEJB")
public class EjbTemperatureBean implements EjbTemperatureBeanRemote {
    public EjbTemperatureBean() {
    }

    @Override
    public double celciusToFahrenheit(double t) {
        return 9.0 / 5.0 * t + 32;
    }

    @Override
    public double fahrenheitToCelcius(double t) {
        return (t - 32) * 5.0 / 9.0;
    }
}
