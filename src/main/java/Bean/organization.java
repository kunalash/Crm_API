package Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class organization {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String website;
	
	public organization() {
		super();
		// TODO Auto-generated constructor stub
	}

	public organization(int id, String name, String website) {
		super();
		this.id = id;
		this.name = name;
		this.website = website;
	}

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

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public String toString() {
		return "organization [id=" + id + ", name=" + name + ", website=" + website + "]";
	}
	
	

}
