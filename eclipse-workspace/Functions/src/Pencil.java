
public class Pencil {
	int price;
	String color;
	String brand;
	public void findmax(Pencil[]a) {
		for(int i=0; i<a.length; i++) {
			if(a[i].price>=20) {
				System.out.println(a[i].price+" is high cost");
			}
			else {
				System.out.println(a[i].price+" is low cost");
			}
			
		}
	
	}
	

}
