package fortuneTeller;

public class Person {
	private String firstName;
	private String lastName;
	private String birthMonth;
	private int age;
	private int siblings;
	private String favoriteColor;

	public Person(String firstName, String lastName, 
			String birthMonth, int age, 
			int siblings, String favoriteColor) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthMonth = birthMonth;
		this.age = age;
		this.siblings = siblings;
		this.favoriteColor = favoriteColor;
	}

	public String getFirstName() {
		return firstName;
	}

	
	public String getLastName() {
		return lastName;
	}

	public String getBirthMonth() {
		return birthMonth;
	}

	public int getAge() {
		return age;
	}

	public int getSiblings() {
		return siblings;
	}

	public String getFavoriteColor() {
		return favoriteColor;
	}
	
	public String getFullName() {
		return firstName+lastName;
	}
}
