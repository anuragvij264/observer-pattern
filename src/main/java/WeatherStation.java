package observerpattern.src.main.java;

public class WeatherStation {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
    HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

    // Just passing in fake measurement values for testing
    weatherData.setMeasurements(80, 65, 30f);
  }
}
