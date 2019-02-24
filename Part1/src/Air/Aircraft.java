package Air;

import Transportation.PublicTransportation;

/**
 * <p>Aircraft extends PublicTransportation</p>
 * @author <p>Juan Sebastian Hoyos <br/>id:40087920</p>
 * @author <p>Tigran Karapetyan <br/>id: </p>
 */
public class Aircraft extends PublicTransportation
{
    //Created two enumerations to have the possible type of aircraft and the type of maintenance of the aircraft
    /**
     *class of different types of aircrafts
     */
   private enum Type
    {
        /**
         * helicopter Type
         */
        helicopter,
        /**
         * airline Type
         */
        airline,
        /**
         * glider Type
         */
        glider,
        /**
         * balloon Type
         */
        balloon
    }

    /**
     * class of different types of maintenance
     */
   private enum MaintenanceType
    {
        /**
         * weekly maintenance
         */
        weekly,
        /**
         * monthly maintenance
         */
        mothly,
        /**
         * yearly maintenance
         */
        yearly
    }

    private Type aircraft_type;
    public MaintenanceType maintenance;

    //constructors

    /**
     * <p>Default constructor to initialize newly created objects to an airline type and a yearly maintenance</p>
     */
    public Aircraft()
    {
        aircraft_type= Type.airline;
        maintenance= MaintenanceType.yearly;
    }

    /**
     * <p>Parametrized constructor to initialize newly created objects to the given parameters</p>
     * @param ticket_price double
     * @param num_stops int
     * @param type Type
     * @param maintenance MaintenanceType
     */
    public Aircraft(double ticket_price, int num_stops, Type type, MaintenanceType maintenance)
    {
        super(ticket_price,num_stops);
        aircraft_type=type;
        this.maintenance=maintenance;
    }

    /**
     * <p>Copy constructor to initialize a newly created object identically to a previous created object</p>
     * @param aircraft
     */
    public Aircraft(Aircraft aircraft)
    {
        super(aircraft);
        aircraft_type=aircraft.getType();
        maintenance=aircraft.getMaintenance_Type();

    }
    // Setter and Getters

    /**
     * <p>Getter to obtain the type of the aircraft</p>
     * @return Type
     */
    public Type getType()
    {
        return aircraft_type;
    }

    /**
     * <p>Getter to return the type of maintenance</p>
     * @return MaintenaceType
     */
    public MaintenanceType getMaintenance_Type()
    {
        return maintenance;
    }

    /**
     * <p>Setter to change the Type of aircraft</p>
     * @param aircraft_type Type
     */
    public void setType(Type aircraft_type)
    {
        this.aircraft_type=aircraft_type;
    }

    /**
     * <p>Setter to change the type of maintenance</p>
     * @param maintenance MaintenanceType
     */
    public void setMaintenance_Type(MaintenanceType maintenance)
    {
        this.maintenance=maintenance;
    }
    //toString method and equals method

    @Override
    public String toString() {
        return super.toString() + ", it is a " + getType() + " and it has a " + getMaintenance_Type() + " maintenance";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Aircraft aircraft = (Aircraft) o;
        return aircraft_type == aircraft.aircraft_type &&
                maintenance == aircraft.maintenance;
    }
}
