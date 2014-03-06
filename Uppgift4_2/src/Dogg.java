
public class Dogg extends Mammal  {
	
	private String size;
	
	public Dogg(String name, int eyes, String size) {
		super(name, eyes);
		this.size = size;
	}

	
	
	
	public String getSize(){
		return size;
	}

	@Override
	public String getInfo() {
		return( "The dog " + this.name + " has " + this.eyes + " eyes "+" and is " + this.size + " size");
		
	}

}
