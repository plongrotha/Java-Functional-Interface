package shape;

@FunctionalInterface
public interface Shape {
  double getAea();

  default void show() {
    System.out.println("this this new feature");
  }

  default void show2() {
    System.out.println("this is new feature");
  }

  default void show3() {
    System.out.println("this is new feature");
  }
}
