package Transportation;



public class PublicTransportation {
	
	private double ticket_price;
	private int num_stops;
	
	//constructors
	
	//parameterized constructor
	public PublicTransportation(double ticketPrice, int num_stops) {
		this.ticket_price = ticketPrice;
		this.num_stops = num_stops;
	}
	
	//default constructor
	public PublicTransportation() {
		
	}
	
	//copy constructor
	public PublicTransportation(PublicTransportation transport) {
		this.ticket_price=transport.getPrice();
		this.num_stops=transport.getNum_Stops();
	}
		
	//setters getters
	public double getPrice() {
			return ticket_price;
	}
	public void setPrice(double ticketPrice) {
			this.ticket_price = ticketPrice;
	}
	public int getNum_Stops() {
			return num_stops;
	}
	public void setNum_Stops(int num_stops) {
			this.num_stops = num_stops;
	}
	
	//toString method
	@Override
	public String toString() {
			return "PublicTransportation [ticket Price=" + ticket_price + ", number of Stops=" + num_stops + "]";
	}
	
	//equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
				return true;
		if (obj == null)
				return false;
		if (getClass() != obj.getClass())
				return false;
		PublicTransportation other = (PublicTransportation) obj;
		if (num_stops != other.num_stops)
				return false;
		if (Double.doubleToLongBits(ticket_price) != Double.doubleToLongBits(other.ticket_price))
			return false;
		return true;
	}


}
