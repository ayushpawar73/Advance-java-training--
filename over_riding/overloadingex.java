package over_riding;
 class overloadingex1  {
	void area() {
	System.out.println("The area ");
	}
	void area(double a,double b) {
		System.out.println("The area triangle is " +(0.5*a*b));
		}
	void area(float b,int h) {
		System.out.println("The perimeter of rectangle is " +(b*h));
		}
	void area(int l) {
		System.out.println("The area of circle is " +(3.14*l*l));
		}
}
public class overloadingex {

	public static void main(String[] args) {
		overloadingex1 n=new overloadingex1();
		n.area();
		n.area(30d,45d);
		n.area(63.3f,96);
		n.area(5);
		// TODO Auto-generated method stub

	}

}
