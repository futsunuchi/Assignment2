package Transportation;



public class PublicTransportation {
	
		private double ticket_price;
		private int num_stops;
		
		public double getTicketPrice() {
			return ticket_price;
		}
		public void setTicketPrice(double ticketPrice) {
			this.ticket_price = ticketPrice;
		}
		public int getNbOfStops() {
			return num_stops;
		}
		public void setNbOfStops(int nbOfStops) {
			this.num_stops = nbOfStops;
		}
		@Override
		public String toString() {
			return "PublicTransportation [ticketPrice=" + ticket_price + ", nbOfStops=" + num_stops + "]";
		}
		public PublicTransportation(double ticketPrice, int nbOfStops) {
			this.ticket_price = ticketPrice;
			this.num_stops = nbOfStops;
		}
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
