package swapnil.c2tc.application;

import swapnil.c2tc.framework.BankFactory;
import swapnil.c2tc.framework.CurrentAcc;
import swapnil.c2tc.framework.SavingAcc;

public class MMBankFactory implements BankFactory {
	
	public SavingAcc getNewSavingAccount(int accNo, String accNum, float accBal) {
		SavingAcc sa = new SavingAcc(accNo,accNum,accBal);
		return sa;
	}



	public CurrentAcc getNewCurrentAccount(int accNo, String accNum, float accBal) {
		CurrentAcc ca = new CurrentAcc(accNo,accNum,accBal);
		return ca;
	}
	
}
