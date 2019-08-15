public class User {
    private String username;
    private int travelCount;
    private User nextUser;
    private static Travel firstTravel;

    public User(String username) {
        this.username = username;
        this.firstTravel = null;
        nextUser = null;
        travelCount = 0;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User getNextUser() {
        return nextUser;
    }

    public void setNextUser(User nextUser) {
        this.nextUser = nextUser;
    }

    public Travel getFirstTravel() {
        return firstTravel;
    }

    public  int getTravelCount(){ return  travelCount;}

    public void setFirstTravel(Travel firstTravel) {
        this.firstTravel = firstTravel;
        travelCount++;
    }

    public void addTravel(String current, String dest){
        travelCount++;
        Travel temp = new Travel(current,dest);
        Travel tempTravelHead = firstTravel;
        while (firstTravel.getNextTravel() != null)
            firstTravel = firstTravel.getNextTravel();
        firstTravel.setNextTravel(temp);
        firstTravel = tempTravelHead;
    }

}
