package spring.di.vo;

public class Address {
	private String zipcode;
	private String address;
	
	public Address(){}

	public Address(String zipcode, String address) {
		super();
		this.zipcode = zipcode;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [zipcode=" + zipcode + ", address=" + address + "]";
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
