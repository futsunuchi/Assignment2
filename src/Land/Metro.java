package Land;

public class Metro extends CityBus{
	private int nbOfVehicles;
	private String nameOfCity;
	public int getNbOfVehicles() {
		return nbOfVehicles;
	}
	public void setNbOfVehicles(int nbOfVehicles) {
		this.nbOfVehicles = nbOfVehicles;
	}
	public String getNameOfCity() {
		return nameOfCity;
	}
	public void setNameOfCity(String nameOfCity) {
		this.nameOfCity = nameOfCity;
	}
	public Metro(double ticketPrice, int nbOfStops, long routNb, int beginOpYear, String lineName, String driverName,
			int nbOfVehicles, String nameOfCity) {
		super(ticketPrice, nbOfStops, routNb, beginOpYear, lineName, driverName);
		this.nbOfVehicles = nbOfVehicles;
		this.nameOfCity = nameOfCity;
	}
	@Override
	public String toString() {
		return "Metro [nbOfVehicles=" + nbOfVehicles + ", nameOfCity=" + nameOfCity + ", getNbOfVehicles()="
				+ getNbOfVehicles() + ", getNameOfCity()=" + getNameOfCity() + ", getRoutNb()=" + getRoutNb()
				+ ", getBeginOpYear()=" + getBeginOpYear() + ", getLineName()=" + getLineName() + ", getDriverName()="
				+ getDriverName() + ", toString()=" + super.toString() + ", getTicketPrice()=" + getTicketPrice()
				+ ", getNbOfStops()=" + getNbOfStops() 
				+ "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Metro other = (Metro) obj;
		if (nameOfCity == null) {
			if (other.nameOfCity != null)
				return false;
		} else if (!nameOfCity.equals(other.nameOfCity))
			return false;
		if (nbOfVehicles != other.nbOfVehicles)
			return false;
		return true;
	}

}
