package my_work;

public class Train {
	private int id;
	private String trainCode;
	private String stationName;
	private String arrivalTime;
	private String departureTime;

	public Train(int id, String trainCode, String stationName, String arrivalTime, String departureTime) {
		this.id = id;
		this.trainCode = trainCode;
		this.stationName = stationName;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}
	
	
	
	public int getId() {
		return id;
	}



	String getTrainCode() {
		return trainCode;
	}



	



	public String getStationName() {
		return stationName;
	}



	

	public String getArrivalTime() {
		return arrivalTime;
	}



	



	public String getDepartureTime() {
		return departureTime;
	}





	public  void printTrainSchedule() {
		
		
		System.out.printf("%d %1s %17s %8s % 11s \n" + id, trainCode, stationName, arrivalTime, departureTime); 
		
	}
	
	public static void main(String[] args) {
		System.out.println("Yasvantpur Delhi Sarai Rohilla AC Duronto AC Duronto Express (12213)");
		System.out.println("-------------------------------------------------");
		System.out.println("#   Code   Station         Arr.   Dep.");
		System.out.println("-------------------------------------------------");
		
		Train[] t = {
					new Train(1,"YPR", "Yasvantpur Jn", "", "23:40"),
					new Train(2,"GTL", "Yasvantpur Jn", "03.45", "23:40"),
					new Train(3,"SC", "Yasvantpur Jn", "08.55", "23:40"),
					new Train(4,"BPQ", "Yasvantpur Jn", "13.30", "23:40"),
					new Train(5,"HBJ", "Yasvantpur Jn", "21.20", "23:40"),
					new Train(6,"JHS", "Yasvantpur Jn", "01.15", "23:40"),
					new Train(7, "DEE", "Yasvantpur Jn", "07.00", "23:40"),


				};
		
		for (Train : t)
			t.printTrainSchedule();
		
	
		
		
		
	}
	

}
