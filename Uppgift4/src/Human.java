
public class Human {
	
	private String name;
	private Dog dog;
	
	public Human(String name){
		this.name = name;
	}

	
	public String getName(){
		return name;
	}
	
	public void buyDog(Dog dog){
		this.dog = dog;
	}
	
	public String getInfo(){
		String s = "";
		if (dog != null){
			s = getName() + " Šger en hund som heter " + dog.getName();
		}else{
			s = getName() + " Šger inte en hund";
		}
		return s;
	
		
		
	}
}
