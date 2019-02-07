package Land;

import Transportation.*;

public class CityBus extends PublicTransportation{
	
	private long routNb;
	private int beginOpYear;
	private String lineName;
	private String driverName;
	
	public long getRoutNb() {
		return routNb;
	}
	public void setRoutNb(long routNb) {
		this.routNb = routNb;
	}
	public int getBeginOpYear() {
		return beginOpYear;
	}
	public void setBeginOpYear(int beginOpYear) {
		this.beginOpYear = beginOpYear;
	}
	public String getLineName() {
		return lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public CityBus(double ticketPrice, int nbOfStops, long routNb, int beginOpYear, String lineName,
			String driverName) {
		super(ticketPrice, nbOfStops);
		this.routNb = routNb;
		this.beginOpYear = beginOpYear;
		this.lineName = lineName;
		this.driverName = driverName;
	}
	@Override
	public String toString() {
		return "CityBus [routNb=" + routNb + ", beginOpYear=" + beginOpYear + ", lineName=" + lineName + ", driverName="
				+ driverName + ", getRoutNb()=" + getRoutNb() + ", getBeginOpYear()=" + getBeginOpYear()
				+ ", getLineName()=" + getLineName() + ", getDriverName()=" + getDriverName() + ", getTicketPrice()="
				+ getTicketPrice() + ", getNbOfStops()=" + getNbOfStops()+ "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CityBus other = (CityBus) obj;
		if (beginOpYear != other.beginOpYear)
			return false;
		if (driverName == null) {
			if (other.driverName != null)
				return false;
		} else if (!driverName.equals(other.driverName))
			return false;
		if (lineName == null) {
			if (other.lineName != null)
				return false;
		} else if (!lineName.equals(other.lineName))
			return false;
		if (routNb != other.routNb)
			return false;
		return true;
	}
	

}
