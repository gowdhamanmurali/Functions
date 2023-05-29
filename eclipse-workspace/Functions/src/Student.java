
public class Student {
	public String add(int tamil, int english, int maths, int science, int social) {
		return "total="+(tamil+english+maths+science+social);
	}
	public static void main (String[]args) {
		Student s1=new Student();
		System.out.println(s1.add(86,95,96,88,79));
	}

}
