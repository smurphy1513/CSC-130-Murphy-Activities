
public class ShowPics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Picture userPicture = new Picture("puppy.jpg");
		userPicture.draw();
		
		Picture secondPicture = new Picture("puppy.jpg");
		secondPicture.translate(200, 200);
		secondPicture.draw();*/
			
		Picture catPicture = new Picture("cat.jpg");
		catPicture.grow(-100, -100);
		catPicture.draw();
		
		Picture secondCat = new Picture("cat.jpg");
		int width = secondCat.getWidth();
		int height = secondCat.getHeight();
		secondCat.translate(width, height);
		secondCat.draw();
		
		Picture fishPic = new Picture("fish.jpg");
		int width1 = fishPic.getWidth();
		int height2 = fishPic.getHeight(); 
		fishPic.translate(4*width1, height2);
		fishPic.draw();
		
		Picture fishPic2 = new Picture("fish.jpg");
		fishPic2.translate(0.5*width1, 4*height2);
		fishPic2.draw();
		
		Picture secondPicture = new Picture("puppy.jpg");
		int width3 = secondPicture.getWidth();
		int height4 = secondPicture.getHeight(); 
		secondPicture.translate(3*width3, height4);
		secondPicture.draw();
		
		Picture dog = new Picture("puppy.jpg");
		dog.translate(1.5*width3, 4*height4);
		dog.draw();
		
		//public void saveToDisk(java.lang.String "puppy.jpg");
	}
	
}
