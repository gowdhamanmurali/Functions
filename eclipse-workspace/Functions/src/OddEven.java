
public class OddEven {
	public String findoddeven(int num1) {
		if(num1%2==0) {
			return "even";
		}
			else {
				return "odd";
			}
		}
	

	public static void main (String[]args) {
		OddEven o1=new OddEven();
		System.out.println(o1.findoddeven(10));
	}

}
