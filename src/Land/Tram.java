package Land;



public class Tram extends CityBus {
	
private int maxSpeed;
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Tram [maxSpeed=" + maxSpeed + ", getMaxSpeed()=" + getMaxSpeed() + ", getRoutNb()=" + getRoutNb()
				+ ", getBeginOpYear()=" + getBeginOpYear() + ", getLineName()=" + getLineName() + ", getDriverName()="
				+ getDriverName() + ", toString()=" + super.toString() + ", getTicketPrice()=" + getTicketPrice()
				+ ", getNbOfStops()=" + getNbOfStops() 
				+ "]";
	}
	
	public Tram(double ticketPrice, int nbOfStops, long routNb, int beginOpYear, String lineName, String driverName,
			int maxSpeed) {
		super(ticketPrice, nbOfStops, routNb, beginOpYear, lineName, driverName);
		this.maxSpeed = maxSpeed;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tram other = (Tram) obj;
		if (maxSpeed != other.maxSpeed)
			return false;
		return true;
	}

}
