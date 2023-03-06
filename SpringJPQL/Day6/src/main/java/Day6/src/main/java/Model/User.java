package Day6.src.main.java.Model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	private String emailid;
	@ElementCollection
	@Embedded
	@JoinTable(name="PhoneNumber",joinColumns = @JoinColumn(name="UserID"))
	private Set<PhoneNumber> pno=new HashSet<PhoneNumber>();
	@Override
	public int hashCode() {
		return Objects.hash(emailid, pno, userId, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(emailid, other.emailid) && Objects.equals(pno, other.pno) && userId == other.userId
				&& Objects.equals(userName, other.userName);
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public Set<PhoneNumber> getPno() {
		return pno;
	}
	public void setPno(Set<PhoneNumber> pno) {
		this.pno = pno;
	}
}
