import java.util.*;

public class In2cm {
  public static void main(String[] args) {
	  int inch;
	  double cm;
	  final double CM_PER_INCH = 2.54;
	  Scanner in = new Scanner(System.in);
	  
	  System.out.print("How many inches? ");
	  inch = in.nextInt();
	  cm = inch * CM_PER_INCH;
	  System.out.print(inch+" in = ");
	  System.out.println(cm+" cm");
  }
}
