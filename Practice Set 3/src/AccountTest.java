import org.junit.Test;


public class AccountTest {

	@Test
	public void testAccount() throws InsufficientFundsException{
		Account tester = new Account(1122, 20000, .045);
		tester.withdraw(2500);
		tester.deposit(3000);
		System.out.println(tester.getBalance());
		System.out.println(tester.getAnnualInterestRate());
		System.out.println(tester.getDateCreated());		
	}
	
	@Test(expected=InsufficientFundsException.class)
	public void testException() throws InsufficientFundsException{
		Account tester = new Account(1122, 20000, .045);
		tester.withdraw(25000);
		tester.deposit(3000);
		System.out.println(tester.getBalance());
		System.out.println(tester.getAnnualInterestRate());
		System.out.println(tester.getDateCreated());		
	}

}
