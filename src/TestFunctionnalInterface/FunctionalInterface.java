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
    // using lambda to count the character
    Function<String, Integer> getlenght2 = name -> name.length();
    System.out.println(getlenght2.apply("Vorn SreyLeak"));

    // ================
    // get the first character
    Function<String, Character> firstChar = text -> text.charAt(0);
    System.out.println(firstChar.apply("Leak"));

    // functional method
    Function<Integer, Integer> power = n -> n * n;
    System.out.println(power.apply(3));




  }
}
