
public class Bike {
	
	private String color;
	private int price;
	private int size;
	private static int nbrOfBikes;
	
	
	public Bike(String color, int size){
		this(color, size, 0);
	}
	
	public Bike(String color, int size, int price){
		this.color = Constants.checkColor(color);
		
		
		if(size > Constants.MIN_SIZE && size < Constants.MAX_SIZE){
			this.size = size;
		}else{
			this.size = Constants.MIN_SIZE;
		}
		if(price > Constants.MIN_PRICE && price < Constants.MAX_PRICE){
		this.price = price;
		}else{
			this.price = Constants.MIN_PRICE;
		}
	}
	
	/** R�knar ut antal cyklar*/
	public static int getNumberOfBikes(){
		return nbrOfBikes;
	}
	
	/** H�mtar f�rgen p� cyklarna*/
	public String getColor(){
		return color;
	
	}
	
	/** H�mtar storleken p� cyklarna*/
	public int getSize(){
		return size;
	}
	
	/** H�mtar priset p� cyklarna*/
	public int getPrice(){
		return price;
	}
	
	public void setPrice(int price){
		if(price > Constants.MIN_PRICE && price < Constants.MAX_PRICE){
			this.price = price;
		}else{
			this.price = Constants.MIN_PRICE;
		}
	}

}
