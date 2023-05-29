
public class UsePencil {
	public static void main (String[]args) {
		
		Pencil p1=new Pencil();
		Pencil p2=new Pencil();
		Pencil p3=new Pencil();
		
		p1.brand="NATRAJ";
		p1.color="BLACK";
		p1.price=20;
		
		p2.brand="CAMLIN";
		p2.color="RED";
		p2.price=40;
		
		p3.brand="APSARA";
		p3.color="GREEN";
		p3.price=50;
		
		Pencil[] pencils= {p1,p2,p3};
		p1.findmax(pencils);
	}

}
