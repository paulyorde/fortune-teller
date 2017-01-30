package fortuneTeller;

public class FortuneTeller {
		
	public String birthMonthTeller(String fullName, String birthMonth) {
		String result = null;
		
		if(fullName.contains(birthMonth.substring(0, 1))) {
			result = " with 1 millllllion dollars #Dr.Evil. in the bank,";
		} else if(fullName.contains(birthMonth.substring(1, 2))) {
			result = " with limitless knowledge of the stock market in the bank,";
		} else if(fullName.contains(birthMonth.substring(2, 3))) {
			result = " with unlimited income for life which will be inherited by your children in the bank,";
		} else {
			result = " with 1 unit of your choice(USD) in the bank,";
		}
		return result;
	}
	
	public String ageTeller(int age) {
		String result = null;
		if(age % 2 == 1) {
			result = " You will retire in 1 year,";
		} else {
			result = " You will retire in 100 years,";
		}
		return result;		
	}
	
	public String siblingsTeller(int siblings) {
		String result = null;
		if(siblings == 0) {
			result = " a vaction home in " + LOCATION.LONDON.getLocation();
		} else if(siblings == 1) {
			result = " a vaction home in " + LOCATION.AMSTERDAM.getLocation();
		} else if(siblings == 2) {
			result = " a vaction home in " + LOCATION.ISLE.getLocation();
		} else if(siblings == 3) {
			result = " a vaction home in " + LOCATION.TOKYO.getLocation();
		} else if(siblings > 3) {
			result = " a vaction home in " + LOCATION.NY.getLocation();
		}
		return result;
	}

	public String colorTeller(String favoriteColor) {
		String result = null;

		if(favoriteColor.equalsIgnoreCase(ROYGBIV.RED.toString())) {
			result = " and a personal Jet Plane";
		} else if(favoriteColor.equalsIgnoreCase(ROYGBIV.ORANGE.toString())) {
			result = " and an economy sized car of your dreams";
		} else if(favoriteColor.equalsIgnoreCase(ROYGBIV.YELLOW.toString())) {
			result = " and a pontune boat with a large intertube for entertaining";
		} else if(favoriteColor.equalsIgnoreCase(ROYGBIV.GREEN.toString())) {
			result = " and a MazdaSpeed3";
		} else if(favoriteColor.equalsIgnoreCase(ROYGBIV.BLUE.toString())) {
			result = " and a Fiat 500";
		} else if(favoriteColor.equalsIgnoreCase(ROYGBIV.INDIGO.toString())) {
			result = " and a 1910 ModelT Ford";
		} else if(favoriteColor.equalsIgnoreCase(ROYGBIV.VIOLET.toString())) {
			result = " and a Moped";
		}
		return result;
	}
}
