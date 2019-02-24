package Land;

import Transportation.*;
/**
 * @author <p>Juan Sebastian Hoyos <br/>id:40087920</p>
 * @author <p>Tigran Karapetyan <br/>id:40096558 </p>
 */public class CityBus extends PublicTransportation{

	//Making these attributes private avoids opening a back door. If there was another class in the package that would extend a class of another package
	//this would creat a privacy leak as it would be possible for this class to access these attributes.
	private long route_number;
	private int op_year_debut;
	private String line_name;
	private String driver_name;
	
	//Constructors
	
	//Parameterized constructor

	/**
	 * parametrized constructor to initialized newly created object to specific values
	 * @param ticketPrice double
	 * @param num_stops int
	 * @param routNb long
 	 * @param beginOpYear int
	 * @param lineName string
	 * @param driverName string
	 */
	public CityBus(double ticketPrice, int num_stops, long routNb, int beginOpYear, String lineName, String driverName) {
		super(ticketPrice, num_stops);
		this.route_number = routNb;
		this.op_year_debut = beginOpYear;
		this.line_name = lineName;
		this.driver_name = driverName;
	}
	//default constructor

	/**
	 * Default constructor to initialize newly created object to default values
	 */
	public CityBus()
	{
		super();
		route_number=3000;
		op_year_debut=2007;
		line_name="Terminus";
		driver_name="Michael";
	}
	//copy constructor

	/**
	 * Copy constructor to initialize newly created object with exact same values as the ones of a previous created object
	 * @param bus CityBus
	 */
	public CityBus(CityBus bus) {
		setPrice(bus.getPrice());
		setNum_Stops(bus.getNum_Stops());
		this.route_number = bus.getRoute_Num();
		this.op_year_debut = bus.getOp_Year_Debut();
		this.line_name = bus.getLineName();
		this.driver_name = bus.getDriverName();
	}
	
	//setters getters

	/**
	 * getter to access the route number
	 * @return long route_number
	 */
	public long getRoute_Num() {
		return route_number;
	}

	/**
	 * setter to change the value of the route number
	 * @param routNb long
	 */
	public void setRoute_Num(long routNb) {
		this.route_number = routNb;
	}

	/**
	 * getter to access the year the object started operating
	 * @return int op_year_debut
	 */
	public int getOp_Year_Debut() {
		return op_year_debut;
	}

	/**
	 * setter to change the value of the year the object started operating
	 * @param beginOpYear int
	 */
	public void setOp_Year_Debut(int beginOpYear) {
		this.op_year_debut = beginOpYear;
	}

	/**
	 *getter to access the name of the line
	 * @return String line_name
	 */
	public String getLineName() {
		return line_name;
	}

	/**
	 * setter to change the name of the line
	 * @param lineName String
	 */
	public void setLineName(String lineName) {
		this.line_name = lineName;
	}

	/**
	 * getter to access the name of the driver
	 * @return String driver_name
	 */
	public String getDriverName() {
		return driver_name;
	}

	/**
	 * setter to change the name of the driver
	 * @param driverName String
	 */
	public void setDriverName(String driverName) {
		this.driver_name = driverName;
	}

	
	//toString
	@Override
	public String toString() {
		return super.toString() + "\nThe route number is " + this.route_number + ", it started operating in " + op_year_debut + ". On the line " + line_name + ", and the driver is "
				+ driver_name;
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
		CityBus other = (CityBus) obj;
		if (op_year_debut != other.op_year_debut)
			return false;
		if (driver_name == null) {
			if (other.driver_name != null)
				return false;
		} else if (!driver_name.equals(other.driver_name))
			return false;
		if (line_name == null) {
			if (other.line_name != null)
				return false;
		} else if (!line_name.equals(other.line_name))
			return false;
		if (route_number != other.route_number)
			return false;
		return true;
	}
	

}
