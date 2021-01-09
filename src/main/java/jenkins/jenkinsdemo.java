package jenkins;

import java.util.ArrayList;

public class jenkinsdemo {

	public jenkinsdemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar = new ArrayList<String>();
	     System.out.println("size of the array list ar = " + ar.size());
	     //add elements
	     ar.add("M");
	     ar.add("A");
	     ar.add("H");
	     ar.add("E");
	     ar.add("S");
	     ar.add("H");
	     System.out.println("array list ar after adding elements = " + ar);
	     System.out.println("size of the array list ar after adding elements = " + ar.size());
	     ar.remove("H");
	     ar.remove("S");
	     System.out.println("array list ar after removing elements = " + ar);
	     System.out.println("size of the array list ar after removing elements = " + ar.size());
	     System.out.println(ar.contains("S"));
	}

}
