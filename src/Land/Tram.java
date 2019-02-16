package Land;
/**
 * @author <p>Juan Sebastian Hoyos <br/>id:40087920</p>
 * @author <p>Tigran Karapetyan <br/>id: </p>
 */
public class Tram extends CityBus {
	
	private int max_speed;
	
	//constructor
	
	//parameterized constructor
	public Tram(double ticketPrice, int nbOfStops, long routNb, int beginOpYear, String lineName, String driverName,
			int maxSpeed) {
		super(ticketPrice, nbOfStops, routNb, beginOpYear, lineName, driverName);
		this.max_speed = maxSpeed;
	}
	
	//default constructor
	public Tram() {
		super();
	}
	
	//copy constructor
	public Tram(Tram tram) {
		super(tram.getPrice(),tram.getNum_Stops(),tram.route_number,tram.op_year_debut,tram.line_name,tram.driver_name);
		//this.driver_name=tram.driver_name;
		//this.line_name=tram.line_name;
		this.max_speed=tram.getMaxSpeed();
		//this.op_year_debut=tram.op_year_debut;
		//this.route_number=tram.route_number;
		//this.setPrice(tram.getPrice());
		//this.setNum_Stops(tram.getNum_Stops());
	}
	
	//setters getters
	public int getMaxSpeed() {
		return max_speed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.max_speed = maxSpeed;
	}

	//toString method
	@Override
	public String toString() {
		return super.toString() + ", has a maximum speed of " + max_speed + "km/h";
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
		Tram other = (Tram) obj;
		if (max_speed != other.max_speed)
			return false;
		return true;
	}

}
