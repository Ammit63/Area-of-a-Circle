public class E09_AreaofCircle {

	public static void main(String[] args) {
		double rad = 7.5;
		double pi = 3.142;
		double area = pi * rad * rad;
		double parimeter = 2 * pi * rad;
		
		System.out.printf("Using a Radius mesured at: " + rad + " and Pi at 3.142, the area is then calculated to be: " + area + ".%n");
		System.out.printf("The calculated area: " +  area + " can be rounded off to to 3 digits after the decimal point so it will show up like this: %.3f %n", area );

		System.out.printf("Using a Radius mesured at: " + rad + " and Pi at 3.142, the parameter is then calculated to be: " + parimeter + ".%n");
		System.out.printf("The calculated parameter: " +  parimeter + " can be rounded off to to 3 digits after the decimal point so it will show up like this: %.3f %n", parimeter );
	}

}
