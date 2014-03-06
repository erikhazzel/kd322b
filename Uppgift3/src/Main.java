import java.util.ArrayList;


public class Main {
	ArrayList<Bike> bikeList = new ArrayList<Bike>();

	public Main(){
		
		bikeList.add(new Bike("Blue", 20, 5000));
		bikeList.add(new Bike("Black", 24, 1000));
		bikeList.add(new Bike("Black", 26, 10000));
		bikeList.add(new Bike("Red", 24, 7000));
		bikeList.add(new Bike("Pink", 16, 2000));
		bikeList.add(new Bike("Red", 20, 4000));
		bikeList.add(new Bike("Black", 26, 15000));
		bikeList.add(new Bike("Black", 22, 9000));
		bikeList.add(new Bike("Blue", 28, 25000));
		bikeList.add(new Bike("Blue", 24, 10000));
		
		for(int i = 0; i < bikeList.size(); i++){
			
			System.out.print(bikeList.get(i).getColor());
			System.out.print(bikeList.get(i).getSize());
			System.out.print(bikeList.get(i).getPrice());
			
		}
		
	}

}
