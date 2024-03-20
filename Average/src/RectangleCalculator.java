public class RectangleCalculator{
  public static void main(String[] args) {
    int num1 = 100;
    int num2 = 20;

    System.out.println("The area of the rectangle is: " + area(num1, num2));
    System.out.println("The perimeter of the rectangle is: " + perimeter(num1, num2));
  }

  static int area(int length, int width) {
    return length * width;
  }
  static int perimeter(int length, int width) {
    return 2 * (length + width);
  }
}
