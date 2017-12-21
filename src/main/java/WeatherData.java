package observerpattern.src.main.java;

import java.util.ArrayList;

/*
  WeatherData is an object that implements the Subject. It is the ONE in the one to many
  relationship (it maintains the weather's state then notifies observers of updates)
*/
public class WeatherData implements Subject {
  private ArrayList<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer o) {
    this.observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    int i = this.observers.indexOf(o);
    if (i >= 0) {
      this.observers.remove(i);
    }
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(temperature, humidity, pressure);
    }
  }

  ////////////////////////////////////////////////////////

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;

    // On call of this setter, now we call this!
    // And this method will notify our observers of the state change
    this.measurementsChanged();
  }

  public void measurementsChanged() {
    notifyObservers();
  }

}
