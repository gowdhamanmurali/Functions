
public class Car {
	int price;
	String color;
	String brand;
	
	public void findmaxprice(Car a, Car b) {
		if(a.price>b.price) {
			System.out.println(a.brand+" is greater");
		}
		else {
			System.out.println(b.brand+" is greater");
		}
	}

}
