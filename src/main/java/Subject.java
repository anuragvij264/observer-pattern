package observerpattern.src.main.java;

/*
  An interface that will be implemented by ONE object.
  The Subject's job is to maintain the state (instance variables) of the object,
  and then notify all its observers when the object's state changes.
 */
public interface Subject {
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();
}
