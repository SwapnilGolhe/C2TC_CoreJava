package swapnil.c2tc.application;

import swapnil.c2tc.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	public MMSavingAcc(int accNo, String accNum, float accBal) {
		super(accNo, accNum, accBal);
		
	}

	@Override
	public void Deposite(float amount) {
		System.out.println("");
	}

	@Override
	public String toString() {
		return "MMSavingAcc [isWithdraw()=" + isaccBal() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccNum()=" + getAccNm() + ", getAccBal()=" + getAccBal() +  "]";
	}

}
