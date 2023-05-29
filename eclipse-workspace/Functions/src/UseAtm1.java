
public class UseAtm1 {
	public static void main (String[]args) {
		Atm1 atm=new Atm1();
		atm.mainBalance=1500;
		atm.depositAmount=500;
		atm.bankName="SBI";
		
		atm.findcredit(atm.mainBalance,atm.depositAmount);
	}

}


