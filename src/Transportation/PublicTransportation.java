package Transportation;


/**
 * @author <p>Juan Sebastian Hoyos <br/>id:40087920</p>
 * @author <p>Tigran Karapetyan <br/>id: </p>
 */
public class PublicTransportation {
	
	private double ticket_price;
	private int num_stops;


	//copy constructor
	public PublicTransportation(PublicTransportation transport) {
		this.ticket_price=transport.getPrice();
		this.num_stops=transport.getNum_Stops();
	}
	//Default constructor
	public PublicTransportation()
	{
		ticket_price=3.25;
		num_stops=17;
	}
	//Parametrized constructor
	public PublicTransportation(double ticketPrice, int nbOfStops) {
		this.ticket_price = ticketPrice;
		this.num_stops = nbOfStops;
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
			return "This " + this.getClass().toString().substring(6) + " has " + num_stops + " stops, and it cost " + ticket_price + "$";
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
