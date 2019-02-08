package Water;

import Transportation.PublicTransportation;


public class Ferry extends PublicTransportation{
	private int buildYear;
	private String shipName;
	public Ferry(double ticketPrice, int nbOfStops, int buildYear, String shipName) {
		super(ticketPrice, nbOfStops);
		this.buildYear = buildYear;
		this.shipName = shipName;
	}
	public int getBuildYear() {
		return buildYear;
	}
	public void setBuildYear(int buildYear) {
		this.buildYear = buildYear;
	}
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	@Override
	public String toString() {
		return "Ferry [buildYear=" + buildYear + ", shipName=" + shipName + ", getBuildYear()=" + getBuildYear()
				+ ", getShipName()=" + getShipName() + ", getTicketPrice()=" + getPrice() + ", getNbOfStops()="
				+ getNum_Stops() + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ferry other = (Ferry) obj;
		if (buildYear != other.buildYear)
			return false;
		if (shipName == null) {
			if (other.shipName != null)
				return false;
		} else if (!shipName.equals(other.shipName))
			return false;
		return true;
	}
	

}
