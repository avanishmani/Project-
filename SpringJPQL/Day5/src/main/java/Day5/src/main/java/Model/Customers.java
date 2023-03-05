package Day5.src.main.java.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cid;
	private String name;
	private Integer mobileNumber;
	private String email;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> addresses; // Has-A relationship
	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", name=" + name + ", mobileNumber=" + mobileNumber + ", email=" + email
				+ ", addresses=" + addresses + "]";
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
}
