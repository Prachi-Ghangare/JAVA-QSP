//Write a program to display the population for each of the next five years. Assume the current population is 312,032,486 and one year has 365 days.

class PopulationProjection {
    public static void main(String[] args) {
        long currentPopulation = 312032486;
        long secondsInYear = 365*24*60*60;
        long birthPerYear = secondsInYear/7;
        long deathPerYear = secondsInYear/13;
        long immigrantsPerYear = secondsInYear/45;
        long newPopulation = currentPopulation+((birthPerYear-deathPerYear+immigrantsPerYear)*5);
        System.out.println("Current Population : "+currentPopulation);
        System.out.println("After five years : "+newPopulation);
    }
}
