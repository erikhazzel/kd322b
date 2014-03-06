
public class House {
	private int year;
	private int size;
	private static int nbrOfHouses;
	public static final int MIN_SIZE = 10;
	public House(int _year,int _size){
		nbrOfHouses = nbrOfHouses +1;
		year = _year;
		if(_size > MIN_SIZE){
		size = _size;
		}
		else {
			size = MIN_SIZE;
		}
		
	}
	public static int getNbrHouses(){
		return nbrOfHouses;
	}
	public int getYear(){
		return year;
	}
	public int getSize(){
		return size;
	}

}
