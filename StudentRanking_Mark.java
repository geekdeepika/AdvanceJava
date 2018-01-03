package advanceJavaExam;



	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;

	 class Student1  {
	    private String studentname;
	    private int rollno;
	    private int totalmark;

	    public Student1(int rollno, String studentname, int studentmark) {
	        this.rollno = rollno;
	        this.studentname = studentname;
	        this.totalmark = totalmark;
	    }
	    
	    public String getStudentname() {
	    	return this.studentname;
	    }
	    
	    public int getTotalMark() {
	    	return this.totalmark;
	    }
	    
	    public static Comparator<Student1> StuNameComparator = new Comparator<Student1>() {

		public int compare(Student1 s1, Student1 s2) {
		   String StudentName1 = s1.getStudentname().toUpperCase();
		   String StudentName2 = s2.getStudentname().toUpperCase();

		   //ascending order
		   return StudentName1.compareTo(StudentName2);

		   //descending order
		   //return StudentName2.compareTo(StudentName1);
	    }};

	    /*Comparator for sorting the list by roll no*/
	    public static Comparator<Student1> StuTotalMark = new Comparator<Student1>() {

		public int compare(Student1 s1, Student1 s2) {

		   int totalmark1 = s1.getTotalMark();
		   int totalmark2 = s2.getTotalMark();

		   /*For ascending order*/
		   return totalmark1-totalmark2;

		   /*For descending order*/
		   //rollno2-rollno1;
	   }};
	    @Override
	    public String toString() {
	        return "[ rollno=" + rollno + ", name=" + studentname + ",  mark= "+ totalmark + "]";
	    }

	}



	public class StudentRanking_Mark  {

		public static void main(String args[]){
		   ArrayList<Student1> arraylist = new ArrayList<Student1>();
		   arraylist.add(new Student1(101, "Zues", 500));
		   arraylist.add(new Student1(505, "Abey", 580));
		   arraylist.add(new Student1(809, "Vignesh", 599));

		   /*Sorting based on Student Name*/
		   System.out.println("Student Name Sorting:");
		   Collections.sort(arraylist, Student1.StuNameComparator);

		   for(Student1 str: arraylist){
				System.out.println(str);
		   }

		   /* Sorting on Rollno property*/
		   System.out.println("totalmark Sorting:");
		   Collections.sort(arraylist, Student1.StuTotalMark);
		   for(Student1 str: arraylist){
				System.out.println(str);
		   }
		}
}