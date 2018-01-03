package advanceJavaExam;

import java.util.Vector;

public class Vector_Tekarch {

		public static void main(String []args){

			Vector<String> myVector=new Vector<String>(10,2); //declare vector
			String sample="tekarch";			 //test string declared

			myVector.add(sample);			 //adds sample's value to the vector

			System.out.println("Value is :"+myVector.get(0));   		//Displays the value

		}//end of main

	}//end of class
	