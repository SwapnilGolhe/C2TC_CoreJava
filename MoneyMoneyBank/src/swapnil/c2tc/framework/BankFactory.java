package swapnil.c2tc.framework;

public interface BankFactory {
	 SavingAcc getNewSavingAccount(int accNo, String accNum, float accBal);
	 CurrentAcc getNewCurrentAccount(int accNo, String accNum, float accBal);
	
}
