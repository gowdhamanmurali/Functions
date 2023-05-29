
public class StudentAverage {
	public void Average(int tamil, int english, int maths, int science, int social) {
		System.out.println((tamil+english+maths+science+social)/5);
	}
	public static void main (String[]args) {
		StudentAverage s1=new StudentAverage();
		s1.Average(80, 90, 78, 88, 97);
	}

}
