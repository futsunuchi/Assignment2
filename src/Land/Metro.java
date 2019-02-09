package Land;
/**
 * @author <p>Juan Sebastian Hoyos <br/>id:40087920</p>
 * @author <p>Tigran Karapetyan <br/>id: </p>
 */
public class Metro extends CityBus{
	private int num_vehicles;
	private String name_city;
	
	//Constructors
	
	//parameterized constructor
	public Metro(double ticketPrice, int nbOfStops, long routNb, int beginOpYear, String lineName, String driverName,
			int nbOfVehicles, String nameOfCity) {
		super(ticketPrice, nbOfStops, routNb, beginOpYear, lineName, driverName);
		this.num_vehicles = nbOfVehicles;
		this.name_city = nameOfCity;
	}
	
	//default constructor
	public Metro() {
		super();
	}
	
	//copy constructor
	public Metro(Metro metro)
	{
		this.driver_name=metro.getDriverName();
		this.line_name=metro.getLineName();
		this.name_city=metro.getNameOfCity();
		this.num_vehicles=metro.getNbOfVehicles();
		this.op_year_debut=metro.getOp_Year_Debut();
		this.route_number=metro.getRoute_Num();
		this.setPrice(metro.getPrice());
		this.setNum_Stops(metro.getNum_Stops());
	}
	
	//setter getters
	public int getNbOfVehicles() {
		return num_vehicles;
	}
	public void setNbOfVehicles(int nbOfVehicles) {
		this.num_vehicles = nbOfVehicles;
	}
	public String getNameOfCity() {
		return name_city;
	}
	public void setNameOfCity(String nameOfCity) {
		this.name_city = nameOfCity;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Metro [number of vehicles =" + num_vehicles + ", name of the city=" + name_city + ", route number()=" + getRoute_Num()
				+ ", operation year debut =" + getOp_Year_Debut() + ", line name =" + getLineName() + ", driver name ="
				+ getDriverName() + ", ticket price =" + getPrice()
				+ ", number of stops =" + getNum_Stops() 
				+ "]";
	}
	
	//equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Metro other = (Metro) obj;
		if (name_city == null) {
			if (other.name_city != null)
				return false;
		} else if (!name_city.equals(other.name_city))
			return false;
		if (num_vehicles != other.num_vehicles)
			return false;
		return true;
	}

}
