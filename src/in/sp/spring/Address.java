package in.sp.spring;

public class Address {
	private String cityname;
	private int houseno;
	private int pincode;
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
//	Here we use Constructor method.................
	
//	public Address(String cityname, int houseno, int pincode) {
//		this.cityname=cityname;
//		this.houseno=houseno;
//		this.pincode=pincode;
//		
//	}
	@Override
	public String toString() {
		return "#"+houseno+", "+cityname+" - "+pincode;
	}

}
