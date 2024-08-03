package functionalInterface;

import java.util.function.Function;

public class FunctionalInterfaceDemo {

  public static void main(String[] args) {

    // Interface can not instatiat object but it can refference to class that
    // implemented from it
    AddFive addFive = new AddFiveImpl();
    int result = addFive.add(20);
    System.out.println(result);

    System.out.println(addFive.add(105));

    // using anomous Class
    AddNumber addNumber = new AddNumber() {
      @Override
      public int add(int num) {
        return num + 100;
      }
    };
    int total = addNumber.add(25);
    System.out.println(total);

    // Lambda Expression to add number
    AddNumber addNumberLambda = (int n) -> n + 300;
    System.out.println(addNumberLambda.add(20));

  }
}
