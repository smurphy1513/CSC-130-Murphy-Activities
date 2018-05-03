import java.util.Scanner;

public class MainMethodSwipe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		SwipeCard myCard = new SwipeCard();
		System.out.println(myCard.toString());
		
		myCard.swipe();
		System.out.println(myCard.toString());
		
		String mealType = scnr.next();
		int meals = myCard.getPossMeals(mealType);
		
		if (myCard.shouldWorry()) {
			System.out.println("It is time to worry");
		}
		else {
			System.out.println("Youre balance is fine");
		}
		
		double testNum = 4.5677;
		System.out.println("Rounding " + testNum +" down to " + myCard.roundDownToNearestPenny(testNum));
	}

}
