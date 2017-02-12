/////////////////////////////////////////////////////////////////////////////
// Semester:         CS367 Spring 2017 
// PROJECT:          p1
// FILE:             ScoreIterator.java
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

import java.util.NoSuchElementException;

/**
 * An iterator to go through a scoreList
 * 
 * @author Cory Van Beek
 *
 */
public class ScoreIterator implements ScoreIteratorADT {

	private ScoreList list;
	private int pointer;
	
	/**
	 * Construct an iterator iterate through a given ScoreList 
	 * considering only the items in the ScoreList that match a given category.
	 * What if the input category does not exist? Throw an exception?
	 * @param list
	 * @param cat
	 */
	public ScoreIterator(ScoreList l, String cat) {
		this.list = new ScoreList();
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).getCategory().equals(cat.substring(0,1))) {
				this.list.add(l.get(i));
			}
		}
		this.pointer = 0;
	}
	
	@Override
	public boolean hasNext() {
		return pointer < list.size();
	}

	@Override
	public Score next() {
		if(!hasNext())
			throw new NoSuchElementException();
		
		return list.get(pointer++);
	}
	
}
