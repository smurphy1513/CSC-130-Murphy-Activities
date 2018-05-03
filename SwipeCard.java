import java.util.Random;

public class SwipeCard {

	private int meals = 0;
	private double cash = 0;
	
	public SwipeCard() {
		Random randNum = new Random();
		meals = randNum.nextInt(101) + 150;
		cash = (double)randNum.nextInt(101) + 200;
	}
	
	public String toString() {
		String string;
		string = "This swipe card has " + meals + " meals and " + cash + " dollars remaining.";
		return string;
	}
	
	public void swipe(){
		meals = meals - 1;
	}
	
	public void spend(double amt) {
		cash = cash - amt;
	}
	
	public int getPossMeals (String mealType) {
		String str1 = mealType;
		String str2 = "meals";
		String str3 = "cash";
		String str4 = "both";
		
		if (str1.equals(str2)) {
			meals = meals + 0;
			System.out.print("This card has " + meals + " meals available.");
		}
		else if (str1.equals(str3)) {
			double COST_OF_MEAL = 10.0;
			meals = (int) Math.round(cash / COST_OF_MEAL);
			//Math.floor(double) rounds down 
			System.out.print("This card has " + meals + " meals available from cash.");
		}
		else if (str1.equals(str4)) {
			double COST_OF_MEAL = 10.0;
			meals = meals + (int) Math.round(cash / COST_OF_MEAL);
			System.out.print("This card has " + meals + " meals available from swipes and cash.");
		}
		else {
			return -1;
		}
		return meals;
	}
	public boolean shouldWorry() {
		if (meals < 15 && cash < 50) {
			return true;
		}
		return false;
	}
	public double roundDownToNearestPenny(double original) {
		cash = original;
		return original = (Math.floor(original * 100)) / 100.0;
	}
}
