package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {

	private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
	
	private int yearJoined;
	private int monthJoined;
	private int dayJoined;
	private int monthWorkingInYear;
	
	private boolean isForeigner;
	private Gender gender;
	
	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;
	
	private Spouse spouse;
	private List<Child> children;
	
	public Employee(EmployeeParams params) {
	    this.employeeId = params.employeeId;
	    this.firstName = params.firstName;
	    this.lastName = params.lastName;
	    this.idNumber = params.idNumber;
	    this.address = params.address;
	    this.yearJoined = params.yearJoined;
	    this.monthJoined = params.monthJoined;
	    this.dayJoined = params.dayJoined;
	    this.isForeigner = params.isForeigner;
	    this.gender = params.gender;
	    children = new LinkedList<>();
	}

	
	/**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */
	
	public void setMonthlySalary(int grade) {
		int baseSalary = 0;
		switch (grade) {
			case 1:
				baseSalary = 3000000;
				break;
			case 2:
				baseSalary = 5000000;
				break;
			case 3:
				baseSalary = 7000000;
				break;
			default:
				baseSalary = 0;
		}

		if (isForeigner) {
			baseSalary *= 1.5;
		}

		this.monthlySalary = baseSalary;
	}


	
	
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
	
	public void setSpouse(String spouseName, String spouseIdNumber) {
	    this.spouse = new Spouse(spouseName, spouseIdNumber);
	}

	
	public void addChild(String childName, String childIdNumber) {
	    children.add(new Child(childName, childIdNumber));
	}

	public int getAnnualIncomeTax() {
		int monthsWorked = getMonthsWorkedThisYear();
		boolean single = isSingle();
		int numberOfChildren = children.size();

		return TaxFunction.calculateTax(
		    monthlySalary,
		    otherMonthlyIncome,
		    monthsWorked,
		    annualDeductible,
		    !single,
		    numberOfChildren
		);

	}
	
	private int getMonthsWorkedThisYear() {
	    LocalDate currentDate = LocalDate.now();
	    if (currentDate.getYear() == yearJoined) {
	        return currentDate.getMonthValue() - monthJoined;
	    }
	    return 12;
	}
	
	private boolean isSingle() {
	    return spouse == null || spouse.isEmpty();
	}



}
