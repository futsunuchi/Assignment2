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
		this.driver_name=tram.getDriverName();
		this.line_name=tram.getLineName();
		this.max_speed=tram.getMaxSpeed();
		this.op_year_debut=tram.getOp_Year_Debut();
		this.route_number=tram.getRoute_Num();
		this.setPrice(tram.getPrice());
		this.setNum_Stops(tram.getNum_Stops());
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
		return "Tram [ maximum speed=" + max_speed + ", roue number=" + getRoute_Num()
				+ ", operation year debut=" + getOp_Year_Debut() + ", line name=" + getLineName() + ", driver name="
				+ getDriverName() + ", ticket price=" + getPrice()
				+ ", number of stops=" + getNum_Stops() 
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
		Tram other = (Tram) obj;
		if (max_speed != other.max_speed)
			return false;
		return true;
	}

}
