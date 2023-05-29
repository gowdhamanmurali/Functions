
public class Switch {
	public void finddays(int day) {
		switch (day) {
		case 1 : System.out.println("SUNDAY");break;
		case 2 : System.out.println("MONDAY");break;
		case 3 : System.out.println("TUESDAY");break;
		case 4 : System.out.println("WEDNESDAY");break;
		case 5 : System.out.println("THURSDAY");break;
		case 6 : System.out.println("FRIDAY");break;
		case 7 : System.out.println("SATURDAY");break;
		default : System.out.println("INVALID");break;
		}
	}
	public static void main (String[]args) {
		Switch d1=new Switch();
		d1.finddays(5);
	}

}
