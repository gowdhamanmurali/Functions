
public class findmax {
	public void greater(int age1, int age2, int age3) {
		if(age1>age2 && age1>age3) {
			System.out.println("age1 is greater");
		}
		else if (age2>age1 && age2>age3) {
			System.out.println("age2 is greater");
		}
		else {
			System.out.println("age3 is greater");
		}
	}
	public static void main (String[]args) {
		findmax f1=new findmax();
		f1.greater(40, 50, 60);
	}

}
