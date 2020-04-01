package oops.abstraction.interf;

public class StateBank implements RBIBank{
	public void fundTransfer() {
		// Only one transaction per payee can be made in a single day 

		System.out.println("Inside SBI Bank :  I have my own way of Fund trasfer"  );
	}

	public void addBeneficiery() {
		// Same bank benificiery can get activated in 30 mins

		System.out.println("Inside SBI Bank : I have my own way of Beneficiery management"  );

	}

	public void makeDeposit() {
		System.out.println("Inside SBI Bank : I have my own way of Make Deposit"  );

	}

	public void balanceCheck() {
		System.out.println("Inside SBI Bank : Balance Check"  );

	}

	public void applyLoan() {
		System.out.println("Inside SBI Bank : Apply Loan"  );

	}

	public void applyOverdraft() {
		System.out.println("Inside SBI Bank : Apply Over Draft"  );

	}

}
