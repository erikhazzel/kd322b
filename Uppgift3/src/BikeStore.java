import java.util.ArrayList;


public class BikeStore {
ArrayList<Bike> bikes = new ArrayList<Bike>();

public String getAllBikes(){
	String s = "";
	for(Bike bike:bikes){
		s = s + " \n one "+bike.getColor()+" bike "+bike.getSize()+" inches "+bike.getPrice()+" kronor ";
		
	}
	return s;
}

public void addBike(String color, int size, int price){
	bikes.add(new Bike(color, size, price));
}
}
