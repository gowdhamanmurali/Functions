
public class UseCar {
	public static void main (String[]args) {
		Car c1=new Car();
		Car c2=new Car();
		
		c1.brand="BMW";
		c1.color="BLACK";
		c1.price=2800000;
		
		c2.brand="HONDA";
		c2.color="BLUE";
		c2.price=750000;
		
		c1.findmaxprice(c1,c2);
	}

}
