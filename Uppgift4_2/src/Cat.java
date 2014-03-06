
public class Cat extends Mammal {
	
	
	private String color;
	
	public Cat(String name, int eyes, String color) {
		super(name, eyes);
		this.color = color;
		
	}

	
	

	
	public String getColor(){
		return color;
	}

	@Override
	public String getInfo() {
		return ( "The cat " + this.name + " has " + this.eyes + " eyes "+" and is " + this.color);
		
	}

}
