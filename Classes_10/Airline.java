import java.util.Objects;
public class Airline {
    String destination;
    int flightNumber;
    String airplaneType;
    String departureTime;
    String weekDay;

    public Airline() {
    }

    public Airline(String destination, int flightNumber, String airplaneType, String departureTime, String weekDay) {
        super();
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.airplaneType = airplaneType;
        this.departureTime = departureTime;
        this.weekDay = weekDay;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    @Override
    public int hashCode() {
        return Objects.hash(airplaneType, departureTime, destination, flightNumber, weekDay);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Airline other = (Airline) obj;
        return Objects.equals(airplaneType, other.airplaneType) && Objects.equals(departureTime, other.departureTime)
                && Objects.equals(destination, other.destination) && flightNumber == other.flightNumber
                && Objects.equals(weekDay, other.weekDay);
    }

    @Override
    public String toString() {
        return "Самолет [место вылета: " + destination + ", номер: " + flightNumber + ", тип: "
                + airplaneType + ", время вылета: " + departureTime + ", день недели: " + weekDay + "]";
    }
}
