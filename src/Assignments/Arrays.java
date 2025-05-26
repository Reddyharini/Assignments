package Assignments;

public class Arrays {

	    public static void main(String[] args) {
	        // 3D array [semesters][subjects][0=subject name, 1=status/marks]
	        String[][][] semesterData = {
	            { // Semester 1
	                {"Mathematics I", "Pass(78)"},
	                {"Physics", "Pass(85)"},
	                {"Chemistry", "Fail(21)"},
	                {"Computer Programming", "Pass(74)"},
	                {"Engineering Drawing", "Pass(88)"},
	                {"Basic Electrical Eng.", "Pass(79)"}
	            },
	            { // Semester 2
	                {"Mathematics II", "Pass(82)"},
	                {"Mechanics", "Pass(77)"},
	                {"Environmental Sci.", "Pass(93)"},
	                {"Basic Electronics", "Fail(19)"},
	                {"Engineering Physics", "Fail(24)"},
	                {"Engineering Graphics", "Pass(90)"}
	            },
	            { // Semester 3
	                {"Data Structures", "Pass(88)"},
	                {"Discrete Mathematics", "Pass(81)"},
	                {"Digital Electronics", "Pass(76)"},
	                {"Operating Systems", "Fail(32)"},
	                {"Signals and Systems", "Pass(85)"},
	                {"Object-Oriented Prog.", "Pass(78)"}
	            },
	            { // Semester 4
	                {"Algorithms", "Pass(91)"},
	                {"Computer Networks", "Pass(73)"},
	                {"Database Systems", "Fail(19)"},
	                {"Microprocessors", "Pass(80)"},
	                {"Communication Eng.", "Pass(76)"},
	                {"Software Engineering", "Pass(87)"}
	            },
	            { // Semester 5
	                {"Probability & Stats", "Pass(82)"},
	                {"Machine Learning", "Pass(77)"},
	                {"Compiler Design", "Pass(93)"},
	                {"Theory of Computation", "Fail(19)"},
	                {"Embedded Systems", "Fail(24)"},
	                {"Computer Graphics", "Pass(90)"}
	            }
	        };

	        // Print Semester 2, Subject 4 and Subject 5 names
	        System.out.println("Semester 2, Subject 4: " + semesterData[1][3][0]);
	        System.out.println("Semester 2, Subject 5: " + semesterData[1][4][0]);

	        // Print Status/Marks of Semester 4, Subject 3 and Subject 6
	        System.out.println("Semester 4, Subject 3 Marks/Status: " + semesterData[3][2][1]);
	        System.out.println("Semester 4, Subject 6 Marks/Status: " + semesterData[3][5][1]);
	    }
	}
