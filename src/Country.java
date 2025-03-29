public class Country {
    private String name;
    private int countPeople;
    private double square;
    private String capital;
    private boolean seaExit;

    Country(String name) {
        this.name = name;
    }

    public int getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public boolean isSeaExit() {
        return seaExit;
    }

    public void setSeaExit(boolean seaExit) {
        this.seaExit = seaExit;
    }

    public void printCountry(Country name) {
        System.out.println("Name: " + this.name);
        System.out.println("Number of people: " + this.countPeople);
        System.out.println("Square: " + String.format("%.0f", this.square));
        System.out.println("Capital: " + this.capital);
        System.out.println("Sea Exit: " + this.seaExit);
    }


}