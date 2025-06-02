package Assignments;

public class Assignment7 {

	    public static void main(String[] args) {
	        // Given customer details
	        String customerName = "John Doe";
	        int creditScore = 720;
	        double income = 55000.0;
	        boolean isEmployed = true;
	        double debtToIncomeRatio = 35.0;

	        // Loan eligibility check
	        boolean isEligible = false;

	        if (creditScore > 750) {
	            isEligible = true; // Automatically approved
	        } else if (creditScore >= 650 && creditScore <= 750) {
	            if (income >= 50000) {
	                if (isEmployed) {
	                    if (debtToIncomeRatio < 40) {
	                        isEligible = true; // Approved
	                    } else {
	                        isEligible = false; // Denied due to high ratio
	                    }
	                } else {
	                    isEligible = false; // Denied due to unemployment
	                }
	            } else {
	                isEligible = false; // Denied due to low income
	            }
	        } else {
	            isEligible = false; // Denied due to low credit score
	        }

	        // Print result
	        System.out.println("Customer Name: " + customerName);
	        if (isEligible) {
	            System.out.println("Loan Status: Approved");
	        } else {
	            System.out.println("Loan Status: Denied");
	        }
	    }
	}
