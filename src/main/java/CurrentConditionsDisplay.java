package observerpattern.src.main.java;

public class CurrentConditionsDisplay implements Observer, Display {

  // The only Subject variables this display cares about
  private float temperature;
  private float humidity;

  // A reference to Subject, whose main purpose is to easily allow ourselves to unregister from
  // the Subject later if we want
  private Subject weatherData;

  public CurrentConditionsDisplay(Subject weatherData) {

    // We save a private reference to the REAL weatherData object inside our constructor here
    this.weatherData = weatherData;

    // Here we register ourselves as listeners to the Subject
    weatherData.registerObserver(this);
  }

  /*
    This is the method from the Observer interface
    */
  @Override
  public void update(float temperature, float humidity, float pressure) {
    // Here's where the Subject gives us the new variable values
    // These are the only variables we care about (pressure is not one we will ever need)
    this.temperature = temperature;
    this.humidity = humidity;

    display();
  }

  /*
    This is the method from the Display interface
   */
  @Override
  public void display() {
    System.out.println("Current conditions display: " + temperature + " degrees and " +
        humidity + "% humidity!");
  }
}