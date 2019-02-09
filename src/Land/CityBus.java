package Land;

import Transportation.*;
/**
 * @author <p>Juan Sebastian Hoyos <br/>id:40087920</p>
 * @author <p>Tigran Karapetyan <br/>id: </p>
 */public class CityBus extends PublicTransportation{
	
	protected long route_number;
	protected int op_year_debut;
	protected String line_name;
	protected String driver_name;
	
	//Constructors
	
	//Parameterized constructor
	public CityBus(double ticketPrice, int num_stops, long routNb, int beginOpYear, String lineName, String driverName) {
		super(ticketPrice, num_stops);
		this.route_number = routNb;
		this.op_year_debut = beginOpYear;
		this.line_name = lineName;
		this.driver_name = driverName;
	}
	//default constructor
	public CityBus() {
		super();
	}
	//copy constructor
	public CityBus(CityBus bus) {
		setPrice(bus.getPrice());
		setNum_Stops(bus.getNum_Stops());
		this.route_number = bus.getRoute_Num();
		this.op_year_debut = bus.getOp_Year_Debut();
		this.line_name = bus.getLineName();
		this.driver_name = bus.getDriverName();
	}
	
	//setters getters
	public long getRoute_Num() {
		return route_number;
	}
	public void setRoute_Num(long routNb) {
		this.route_number = routNb;
	}
	public int getOp_Year_Debut() {
		return op_year_debut;
	}
	public void setOp_Year_Debut(int beginOpYear) {
		this.op_year_debut = beginOpYear;
	}
	public String getLineName() {
		return line_name;
	}
	public void setLineName(String lineName) {
		this.line_name = lineName;
	}
	public String getDriverName() {
		return driver_name;
	}
	public void setDriverName(String driverName) {
		this.driver_name = driverName;
	}

	
	//toString
	@Override
	public String toString() {
		return "CityBus [route number=" + route_number + ", operation year debut =" + op_year_debut + ", line name=" + line_name + ", driver Name="
				+ driver_name +  ", ticket price =" + getPrice() + ", number of stops=" + getNum_Stops()+ "]";
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
