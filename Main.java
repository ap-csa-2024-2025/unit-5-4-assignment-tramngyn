public class Main
{
  public static void main(String[] args)
  {
    double someDist = distance(0, 5, 0, 0);
    System.out.println(someDist);

    System.out.println();
    
    double someNum = quadForm(1,8,16);
    System.out.println(someNum);
  }

  public static double distance(double x1, double y1, double x2, double y2) // Implement distance formula method here
  {
    return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
  }

  public static double quadForm(double a, double b, double c)
  {
    return (-b+Math.sqrt((b*b)-4*a*c))/2*a;
  }
}
