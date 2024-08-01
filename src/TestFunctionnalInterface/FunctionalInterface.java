package TestFunctionnalInterface;

import java.util.function.Function;

public class FunctionalInterface {
  static class ToLenght implements Function<String, Integer> {
    @Override
    public Integer apply(String t) {
      return t.length();
    }
  }
  public static void main(String[] args) {

    Function<String, Integer> getlenght = new ToLenght();
    int lenght = getlenght.apply("Rotha is");
    System.out.println(lenght);


    // ================================================================================
    
  }
}
