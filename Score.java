/////////////////////////////////////////////////////////////////////////////
// Semester:         CS367 Spring 2017 
// PROJECT:          p1
// FILE:             Score.java
//
// TEAM:    Team 54, null
// Authors: (Be sure to check if programming teams are allowed)
// Author1: Cory Van Beek, cvanbeek@wisc.edu, cvanbeek, 
// Author2: Tessa McChesney, tmcchesney@wisc.edu, tmcchesney, Lecture 002
// Author3: DEVESH BRENDAN SULLIVAN, dsullivan7@wisc.edu, dsullivan7, 
// Author4: Yang Qu, qu28@wisc.edu, qu28, Lecture 002
// Author5: Xuyan Wang, xuyan@wisc.edu, xuyan, Lecture 002
// Author6: Tinghe Wang, tzhang329@wisc.edu, tzhang329, 
//
// ---------------- OTHER ASSISTANCE CREDITS 
// Persons: Identify persons by name, relationship to you, and email. 
// Describe in detail the the ideas and help they provided. 
// 
// Online sources: avoid web searches to solve your problems, but if you do 
// search, be sure to include Web URLs and description of 
// of any information you find. 
//////////////////////////// 80 columns wide //////////////////////////////////


/**
 * This class is an object which holds information for an assignment including its name, points scored, and points possible
 * @author Cory Van Beek
 *
 */
public class Score {

	private String name;
	private double points;
	private double maxPoints;
	
	/**
	 * Generates a object of type Score
	 * @param name The name of the assignment
	 * @param points The number of points the student got on the assignment
	 * @param maxPoints The number of possible points in the assignment
	 */
	public Score(String name, double points, double maxPoints){
		//Check for valid parameters
		if(points < 0 || points > maxPoints || name == null || maxPoints < 0)
			throw new IllegalArgumentException();
			
		this.name = name;
		this.points = points;
		this.maxPoints = maxPoints;
	}
	
	/**
	 * @return the maxPoints
	 */
	public double getMaxPossible() {
		return maxPoints;
	}
	
	/**
	 * @return the points
	 */
	public double getPoints() {
		return points;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the first letter of the category
	 */
	public String getCategory(){
		return name.substring(0, 1);
	}
	
	/**
	 * Gets the percentage score for the assignment
	 * @return The percentage
	 */
	public double getPercent(){
		//turns the raw score and max score into a percentage value.
		return (points / maxPoints) * 100.0;
	}
	
	
}
