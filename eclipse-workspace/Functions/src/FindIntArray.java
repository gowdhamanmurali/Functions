
public class FindIntArray {
	public void findmax(int[]a) {
		int max=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
	public static void main (String[]args) {
		FindIntArray array=new FindIntArray();
		int[] age= {10,40,60,80};
		array.findmax(age);
	}
}
