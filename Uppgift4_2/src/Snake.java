
public class Snake  extends Animal{
	
		private String length;
	
		public Snake(String name, String length) {
		super(name);
		this.length = length;
	}

	

		
		public	String getLength(){
			return length;
		}

		@Override
		public String getInfo() {
			return ("The snake " + this.name + " is" + this.length + " meter long");
			
		}
}
