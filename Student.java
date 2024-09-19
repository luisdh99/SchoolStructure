
public class Student {
	
	       String firstName;
	       String lastName;
	       int registration;
	       int grade;
	       int year;
	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
		public Student(String firstName, String lastName, int registration, int grade, int year) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.registration = registration;
	        this.grade = grade;
	        this.year = year;

		   }

	    // Constructor with only name and registration
	    public Student(String firstName, String lastName, int registration) {
	        this(firstName, lastName, registration, 0, 1); // Default grade 0, year 1
	    }

	    // Constructor with name, registration, and grade (default year)
	    public Student(String firstName, String lastName, int registration, int grade) {
	        this(firstName, lastName, registration, grade, 1); // Default year 1
	    }

	    // Method to print full name
	    public void printFullName() {
	        System.out.println(this.firstName + " " + this.lastName);
	    }

	    // Method to check if student is approved (grade >= 60)
	    public boolean isApproved() {
	        return this.grade >= 60;
	    }

	    // Method to change year if student is approved
	    public int changeYearIfApproved() {
	        if (this.isApproved()) {
	            this.year += 1;
	            System.out.println("Pasa al" + this.year);
	        } else {
	            System.out.println("No pasa");
	        }
	        return this.year;
	    }
	

}
