
public class UseAtm {
	public static void main (String[]args) {
		Atm atm=new Atm();
		atm.mainBalance=500;
		atm.depositAmount=1500;
		atm.bankName="SBI";
		
		atm.findcredit(atm.mainBalance,atm.depositAmount);
	}

}
