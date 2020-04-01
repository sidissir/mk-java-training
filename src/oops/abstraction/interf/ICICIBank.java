package oops.abstraction.interf;

public class ICICIBank implements RBIBank {

	public void fundTransfer() {
		// Any number of transactionss 
		System.out.println("Inside ICICI Bank : Fund trasfer"  );
	}

	public void addBeneficiery() {
		// Same bank beneficiery can get activated in no time
		System.out.println("Inside ICICI Bank : Add Beneficiery"  );

	}

	public void makeDeposit() {
		System.out.println("Inside ICICI Bank : Make Deposit"  );

	}

	public void balanceCheck() {
		System.out.println("Inside ICICI Bank : Balance Check"  );

	}

	public void applyLoan() {
		System.out.println("Inside ICICI Bank : Apply Loan"  );

	}

	public void applyOverdraft() {
		System.out.println("Inside ICICI Bank : Apply Over Draft"  );

	}
	
	public void houseLoan() {
		System.out.println("Though RBI is not asking me to do this, I want to do this for my customers ");
	}

}
