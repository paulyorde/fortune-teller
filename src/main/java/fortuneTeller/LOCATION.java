package fortuneTeller;

public enum LOCATION {
	LONDON("London"), NY("New York"), TOKYO("Tokyo"),
	ISLE("Isle of Skye"), AMSTERDAM("Amsterdam");
	
	private final String location;
	
	private LOCATION(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}
}
