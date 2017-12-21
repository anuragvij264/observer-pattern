package observerpattern.src.main.java;

/*
  An interface that will be implemented anytime another object wants to know about changes to the
   Subject's state.
   To implement it, the object's constructor takes in the Subject as a parameter, and then we
   call Subject.registerObserver(this).
 */
public interface Observer {
  public void update(float temperature, float humidity, float pressure);
}
