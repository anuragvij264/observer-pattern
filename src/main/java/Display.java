package observerpattern.src.main.java;

/*
  Since all of our observers have this in common (they are DISPLAYing the Subject data), we can
  make an interface for this too.
 */
public interface Display {
  public void display();
}
