package Land;
/**
 * @author <p>Juan Sebastian Hoyos <br/>id:40087920</p>
 * @author <p>Tigran Karapetyan <br/>id:40096558 </p>
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
	public Tram()
	{
		super();
		max_speed=100;
	}
	
	//copy constructor
	public Tram(Tram tram) {
		super(tram.getPrice(),tram.getNum_Stops(),tram.getRoute_Num(),tram.getOp_Year_Debut(),tram.getLineName(),tram.getDriverName());//Changing the access right of the attributes
		//of citybus class forces us to use getters as the attributes cannot be directly accessed
		this.max_speed=tram.getMaxSpeed();
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
