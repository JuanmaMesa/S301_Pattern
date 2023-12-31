package tasca1_Patterns1.nivell2_AbstractFactory.ImplementacionesConcretas;

import tasca1_Patterns1.nivell2_AbstractFactory.interfaces.PhoneManager;

public class UkAddress implements PhoneManager {

	private String address;
	private String phoneNumber;
	private  final static String uk = "UK adress: "; 


	@Override
	public void createAddress(String address) {
		this.address = uk + address;
		
}

	@Override
	public void createPhoneNumber(String phone) {
		this.phoneNumber = "UK phone: +44 "+phone;
		
	}

	@Override
	public String getAddress() {
		return address;
	}

	@Override
	public String getPhoneNumber() {
		return phoneNumber;
	}


	
}
