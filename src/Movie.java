public class Movie {

    private String title;
    private int spectators, cinemas;
    private double earnings, profit, earningsProjection, profitProjection;

    public Movie(String title, int spectators, int cinemas, double earnings) {
        this.title = title;
        this.spectators = spectators;
        this.cinemas = cinemas;
        this.earnings = earnings;
        this.profit = earnings*0.8;
        this.calculateProjection();
    }
    public void calculateProjection(){
        this.setEarningsProjection((this.getEarningsProjection()/this.getSpectators())/2);
        this.setProfitProjection(this.getEarningsProjection()*0.8);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSpectators() {
        return spectators;
    }

    public void setSpectators(int spectators) {
        this.spectators = spectators;
    }

    public int getCinemas() {
        return cinemas;
    }

    public void setCinemas(int cinemas) {
        this.cinemas = cinemas;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double getEarningsProjection() {
        return earningsProjection;
    }

    public void setEarningsProjection(double earningsProjection) {
        this.earningsProjection = earningsProjection;
    }

    public double getProfitProjection() {return profitProjection;}

    public void setProfitProjection(double profitProjection) {this.profitProjection = profitProjection;}
}