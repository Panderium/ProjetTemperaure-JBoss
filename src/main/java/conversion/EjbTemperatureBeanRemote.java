package conversion;

import javax.ejb.Remote;

@Remote
public interface EjbTemperatureBeanRemote {

    double celciusToFahrenheit(double t) ;

    double fahrenheitToCelcius(double t);
}
