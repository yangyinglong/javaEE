/*
*created by yangyinglong at 20180512
*/

public class Name {
	private String fristName;
	private String lastName;

	public Name(String fristName, String lastName) {
		this.fristName = fristName;
		this.lastName = lastName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFristName() {
		return this.fristName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String toString() {
		return this.fristName + " " + this.lastName;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Name) {
			Name name = (Name)obj;
			return (this.getFristName().equals(name.getFristName())) 
				&& (this.getLastName().equals(name.getLastName()));
		}
		return super.equals(obj);
	}

	public int hashCode() {
		return fristName.hashCode();
	}
}
