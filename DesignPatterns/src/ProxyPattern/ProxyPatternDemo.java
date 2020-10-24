package ProxyPattern;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Image image = new ProxyImage("AbcPic.jpg");

	      //image will be loaded from disk
	      image.display(); 
	      System.out.println("");
	      
	      //image will not be loaded from disk
	      image.display(); 	
		
	}

}
