package Water;

import Transportation.PublicTransportation;


public class Ferry extends PublicTransportation{
	private int build_year;
	private String ship_name;
	public Ferry(double ticketPrice, int nbOfStops, int build_year, String ship_name) {
		super(ticketPrice, nbOfStops);
		this.build_year = build_year;
		this.ship_name = ship_name;
	}
	public int getBuild_year() {
		return build_year;
	}
	public void setBuild_year(int build_year) {
		this.build_year = build_year;
	}
	public String getShip_name() {
		return ship_name;
	}
	public void setShip_name(String ship_name) {
		this.ship_name = ship_name;
	}
	@Override
	public String toString() {
		return "Ferry [build_year=" + build_year + ", ship_name=" + ship_name + ", getBuild_year()=" + getBuild_year()
				+ ", getShip_name()=" + getShip_name() + ", getTicketPrice()=" + getPrice() + ", getNbOfStops()="
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
		if (build_year != other.build_year)
			return false;
		if (ship_name == null) {
			if (other.ship_name != null)
				return false;
		} else if (!ship_name.equals(other.ship_name))
			return false;
		return true;
	}
	

}
