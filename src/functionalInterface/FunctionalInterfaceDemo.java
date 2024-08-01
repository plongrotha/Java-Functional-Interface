package functionalInterface;

import mpl.AddFive;
import mpl.AddFiveImpl;

public class FunctionalInterfaceDemo {

  public static void main(String[] args) {

    AddFive addFive = new AddFiveImpl();
    int result = addFive.add(20);
    System.out.println(result);
  }
}
