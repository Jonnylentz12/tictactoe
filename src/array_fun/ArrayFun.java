package array_fun;

import javax.swing.JOptionPane;

public class ArrayFun {

	public void showInstructions() {
		
		// Next time:  Fix this tedious mess of code with an ARRAY - YEAH!
		/*
		String msg = "";
		String msg0 = "Essential rules for arrays";
		String msg1 = "1. Arrays have a FIXED length!!! " + "At the time they are created.";
		String msg3 = "2. Two ways to set array size:";
		String msg4 = "-- one way is to set size when created with [size]";
		String msg5 = "-- other way is to set size from initial data {n1,n2..}\\";
		String msg6 = "Dynamic - when program is running:";
		String msg7 = "Can NOT NOT NO WAY NO HOW change SIZE of the array!!";
		String msg8 = "But OF COURSE you can change values!";
		
		msg = (msg + "\n" + msg1 + "\n" + msg3 + "\n" + msg4 + "\n" + msg5
				+ msg6 + "\n" + msg7 + "\n" + msg8);
		*/
		
		String[] msgArray = {
				"Essential rules for arrays",
				"1. Arrays have a FIXED length!!! At the time they are created.",
				"2. Two ways to set array size:",
				"-- one way is to set size when created with [size]",
				"-- other way is to set size from initial data {n1,n2..}\\",
				"Dynamic - when program is running:",
				"Can NOT NOT NO WAY NO HOW change SIZE of the array!!",
				"But OF COURSE you can change values!"	
		};
		
		
		JOptionPane.showMessageDialog(null, msgArray);

	}

	public void intArrayExample() {

		// Why an array? Store TONS of info in a single, easy var!

		// int[] intTest = new int (10);
		// First method of creating an array, and then populating it with values
		int[] intTest = new int[14]; // int intTest[] -- this is "math notation"
		intTest[0] = 10;
		intTest[1] = 11;
		intTest[2] = 12;
		intTest[3] = 13;
		intTest[4] = 14;
		intTest[5] = 15;
		intTest[6] = 16;
		intTest[7] = 17;
		intTest[8] = 18;
		intTest[9] = 19;
		intTest[10] = 20;
		intTest[11] = 21;
		intTest[12] = 22;
		intTest[13] = 23;
		
		
		//Second method that combines size & data in one step
		int[] intTwoTest = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

		System.out.println("\nStarting test of intTest[]\n");
		for (int i = 0; i < intTest.length; i++) {

			System.out.println("intTest[" + i + "]: " + intTest[i]);

		}
		System.out.println("\nStarting test of intTwoTest[]\n");
		for (int i = 0; i < intTwoTest.length; i++) {

			System.out.println("intTwoTest[" + i + "]: " + intTwoTest[i]);

		}

	}

} // end of ArrayFun class
