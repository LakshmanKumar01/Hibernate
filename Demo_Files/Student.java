package Kumar.Hibernate3;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id // PK
	private int id;

	private String name;

	private String qualification;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", qualification=" + qualification + "]";
	}

}
