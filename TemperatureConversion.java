/*Sara Murphy*/
/*Converting from Celsius to Fahrenheit*/
/*February 8, 2018*/

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	//
		Scanner scnr = new Scanner(System.in);

		//since they are not whole integers, use double//
		//temperature//
		double temperature;
		double temperatureF;
		double temperatureC;
		
		//weight//
		double weight;
		double pounds;
		double kilograms;
		
		//temperature//
		temperature = 95;
		temperatureC = (((temperature-32)*5)/9);
		temperatureF = ((temperature*(1.8)) + 32);
		
		//weight//
		weight = 20;
		pounds = weight/2.2046;
		kilograms = weight*2.2046;
		
		//temperature//
		System.out.println("Temp: " + temperature);
		System.out.println(temperature + " C is " + temperatureF + " F");
		System.out.println(temperature + " F is " + temperatureC + " C");
		
		System.out.println();
		
		//weight//
		System.out.println("Weight: " + weight);
		System.out.println(weight + " pounds is " + kilograms + " kilograms");
		System.out.println(weight + " kilograms is " + pounds + " pounds");
		
		//If you get a warning type scnr.close();//
	}
	
}
