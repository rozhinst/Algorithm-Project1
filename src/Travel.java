public class Travel {
    private Travel nextTravel;
    private String currentLocation;
    private String destination;

    public Travel(String currentLocation, String destination) {
        this.currentLocation = currentLocation;
        this.destination = destination;
        nextTravel = null;
    }

    public Travel getNextTravel() {
        return nextTravel;
    }

    public void setNextTravel(Travel nextTravel) {
        this.nextTravel = nextTravel;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public String getDestination() {
        return destination;
    }

}
