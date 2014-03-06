
public class Constants {
	
	/**Set minimal bike size to 8*/
	public static final int MIN_SIZE=8;
	
	/**Set maximal bike size to 28*/
	public static final int MAX_SIZE=28;
	
	/**Set minimal bike price to 0 kr */
	public static final int MIN_PRICE=0;
	
	/**Set maximal bike price to 30 000 kr*/
	public static final int MAX_PRICE=30000;
	
	public static final String[] colorArray = {"red", "blue", "black","pink" };
	
	public static final String defaultColor = ("N/A");
	
	public static String checkColor(String color){
		
		boolean foundColor = false;
		
	for(int i = 0; i < colorArray.length; i++){
		if(color.equals(colorArray[i])){
			foundColor = true;
		}
	}
	if(foundColor){
		return color;
	}else{
		return defaultColor;
	}
	}
}



