package Users;

class InadequateWalletBalanceException extends Exception{
	private String message = "Wallet Balance isn't enough to book a ride";
	InadequateWalletBalanceException(){
		super();
	}
}