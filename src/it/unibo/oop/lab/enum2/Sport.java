/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

	BASKET(Place.INDOOR, 5, "Basketball"),
	VOLLEY(Place.INDOOR, 6, "Volleyball"),
	TENNIS(Place.OUTDOOR, 1, "Tennis"),
	BIKE(Place.OUTDOOR, 1, "Mountain Bike"),
	F1(Place.OUTDOOR, 1, "Formula 1"),
	MOTOGP(Place.OUTDOOR, 1, "MotoGP"),
	SOCCER(Place.OUTDOOR, 11, "Football");
	
    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
	private final Place place;
    private final Integer noTeamMembers;
    private final String actualName;
    
	private Sport(final Place place, final Integer teamMembersCount, final String actualName) {
		this.place = place;
		this.noTeamMembers = teamMembersCount;
		this.actualName = actualName;
	}
    
	public boolean isIndividualSport() {
		return this.noTeamMembers == 1;
	}
	
	public boolean isIndoorSport() {
		return this.place.equals(Place.INDOOR);
	}
	
	public Place getPlace() {
		return this.place;
	}
	
	public String toString() {
		return "Sport[ name=" + this.actualName + ", place=" + this.place
                + ", peoplePerTeam=" + this.noTeamMembers + "]";
	}

}
