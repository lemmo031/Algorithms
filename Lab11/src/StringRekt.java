import java.util.ArrayList;

// Brian Mitchell && Dalton Gusaas && Aaron Lemmon
public class StringRekt {

	  Some examples:
	            01234
	  Break up "Super" into 3 parts at indices 2 and 4 so it turns into "Su" and "pe" and "r".
	  Cost of going left to right:
	  -Break "Super" into "Su" and "per", which costs 5
	  -Break "per" into "pe" and "r", which costs 3
	  -Total cost is 8
	  Cost of going right to left:
	  -Break "Super" into "Supe" and "r", which costs 5
	  -Break "Supe" into "Su" and "pe", which costs 4
	  -Total cost is 9
	  
	  
	            01234567
	  Break up "elephant" into 4 parts at indices 1, 3, 5
	  Cost of going left to right: (cut at 1,3,5)
	  -"elephant" to "e" and "lephant" - 8
	  -"lephant" to "le" and "phant" - 7
	  -"phant" to "ph" and "ant" - 5
	  -total = 20
	  
	  Cost of (cut at 1,5,3)
	  -"elephant" to "e" and "lephant" - 8
	  -"lephant" to "leph" and "ant" - 7
	  -"leph" to "le" and "ph" - 4
	  -total = 19
	  
	  Cost of (cut at 3,1,5)
	  -"elephant" to "ele" and "phant" - 8
	  -"ele" to "e" and "le" - 3
	  -"phant" to "ph" and "ant" - 5
	  -total = 16
	  
	  Cost of (cut at 3,5,1)
	  -"elephant" to "ele" and "phant" - 8
	  -"phant" to "ph" and "ant" - 5
	  -"ele" to "e" and "le" - 3
	  -total = 16
	  
	  Cost of (cut at 5,1,3)
	  -"elephant" to "eleph" and "ant" - 8
	  -"eleph" to "e" and "leph" - 5
	  -"leph" to "le" and "ph" - 4
	  -total = 17
	  
	  Cost from right to left: (cut at 5,3,1)
	  -"elephant" to "eleph" and "ant" - 8
	  -"eleph" to "ele" and "ph" - 5
	  -"ele" to "e" and "le" - 3
	  total = 16
	  
	  
	  Algorithm Description
	  Make a method that takes in a string and an Arraylist of indices determining where to cut.
	  In the method, we'll need a 2 dimensional array to store the results of subproblems.
	  Work diagonally filling in the 2-D array using the function written on our paper.
	  Once the table is full, the total cost will be in the top-left cell of the 2-D array.
	  
	 
	public static void main(String[] args) {
		ArrayList<Integer> 
		System.out.println(breakIt("Super", 3, new ArrayList<Integer>())));
	}
}
