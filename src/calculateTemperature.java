class calculateTemperature {
	public static void main(String[] args) {
		double centigrade = 20.0;

	    double kelvin = centigrade + 273;

	    double fahrenheit = (9.0/5.0) * centigrade + 32;

	    // Centigrade to kelvin
	    System.out.println(centigrade + " centigrade = " + kelvin + " Kelvin ");
	    // Centigrade to fahrenheit
	    System.out.println(centigrade + " centigrade = " + fahrenheit + " fahrenheit");

	    // Fahrenheit to kelvin
	    double fahrenheit_to_kelvin = fahrenheit + 457.87;

	    System.out.println(fahrenheit + " fahrenheit = " + fahrenheit_to_kelvin + " Kelvin");
	}
}