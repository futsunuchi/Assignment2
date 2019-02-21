package Water;

import Transportation.PublicTransportation;

import java.util.Objects;

/**
 * <p>Ferry extends PublicTransportation</p>
 * @author <p>Juan Sebastian Hoyos <br/>id:40087920</p>
 * @author <p>Tigran Karapetyan <br/>id: </p>
 */
public class Ferry extends PublicTransportation{
	private int build_year;
	private String ship_name;

	//constructors

	public Ferry()
	{
		super();
		build_year=1998;
		ship_name="Aquaman";
	}

	/**
	 * <p>A parametrized constructor initializes a Ferry object to the given parameters</p>
	 * @param ticketPrice double
	 * @param nbOfStops int
	 * @param build_year int
	 * @param ship_name String
	 */
	public Ferry(double ticketPrice, int nbOfStops, int build_year, String ship_name) {
		super(ticketPrice, nbOfStops);
		this.build_year = build_year;
		this.ship_name = ship_name;
	}
	public Ferry(Ferry ferry)
	{
		super(ferry);
		ship_name=ferry.getShip_name();
		build_year=ferry.getBuild_year();
	}

	//setters and getters
	/**
	 * <p>getter that returns the year the ship was built</p>
	 * @return int
	 */
	public int getBuild_year() {
		return build_year;
	}

	/**
	 * <p>Changes the year the ship was built</p>
	 * @param build_year int
	 */
	public void setBuild_year(int build_year) {
		this.build_year = build_year;
	}

	/**
	 * <p>Returns the name given to the Ferry</p>
	 * @return String
	 */
	public String getShip_name() {
		return ship_name;
	}

	/**
	 * <p>Changes the name of the Ferry</p>
	 * @param ship_name
	 */
	public void setShip_name(String ship_name) {
		this.ship_name = ship_name;
	}

	//To String and equals method
	@Override
	public String toString() {
		return super.toString() + "\nThis ship was given the name of " + getShip_name() + ", and it was built in " + getBuild_year();
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Ferry ferry = (Ferry) o;
		return build_year == ferry.build_year &&
				Objects.equals(ship_name, ferry.ship_name);
	}

}
