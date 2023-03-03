package Day4.src.main.java.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.*;

@Entity
public class Collage {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
	private int collageId;
	private String collageName;
	private String collageAddress;
	@OneToMany(mappedBy = "coll",cascade = CascadeType.ALL)
	private List<Student> li=new ArrayList<Student>();
	public Collage() {
		super();
	}
	@Override
	public String toString() {
		return "Collage [collageId=" + collageId + ", collageName=" + collageName + ", collageAddress=" + collageAddress
				+ "]";
	}
	public Collage(int collageId, String collageName, String collageAddress, List<Student> li) {
		super();
		this.collageId = collageId;
		this.collageName = collageName;
		this.collageAddress = collageAddress;
		this.li = li;
	}
	public int getCollageId() {
		return collageId;
	}
	public void setCollageId(int collageId) {
		this.collageId = collageId;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	public String getCollageAddress() {
		return collageAddress;
	}
	public void setCollageAddress(String collageAddress) {
		this.collageAddress = collageAddress;
	}
	public List<Student> getLi() {
		return li;
	}
	public void setLi(List<Student> li) {
		this.li = li;
	}
}
