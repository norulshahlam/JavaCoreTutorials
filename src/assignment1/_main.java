package assignment1;

import java.util.Deque;
import java.util.LinkedList;

public class _main {

	//encoder
	public static Character check(Character inputCharacter) {

		int counter = 0;
		char[] defaultTable = { 'a', 'b', 'c', 'd','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','(',')','*','+',',','-','.','/'};
		Character result = null;

		//deque is for First in Last out , will need to use linkedlist because deque by default is not able to get value based on position
		Deque<Character> modfiedTable = new LinkedList<Character>();

		for (int i = 0; i < defaultTable.length; i++) { // This is to defaultTable data to dynamic table

			modfiedTable.add(defaultTable[i]);
		}
		for (Character str : modfiedTable) {
			if (str == inputCharacter) {
				System.out.println("Bingo " + counter);
				for(int i = 0; i < counter;i++){//Modify modifiedTable based on the character 

					modfiedTable.offerFirst(modfiedTable.getLast()); // add to first element by getting the last element of an array
					modfiedTable.pollLast(); // Remove the last element 
				}
				break;
			}
			counter++;
		}
		// Shah, you Will need to do some adjustment to this code to get the right subset letter based on shifter 
		// Will require maths to do the calculation
		LinkedList list = (LinkedList) modfiedTable;

		for(int i = 0; i < list.size();i++){
			if(list.get(i).equals(inputCharacter)){
				result = (Character) list.get(i - counter + 1);
				break;
			}
		}

		return result;
	}

	public static void main(String[] args) {

	}
}