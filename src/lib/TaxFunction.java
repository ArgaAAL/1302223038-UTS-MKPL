package lib;

public class TaxFunction {

	
	/**
	 * Fungsi untuk menghitung jumlah pajak penghasilan pegawai yang harus dibayarkan setahun.
	 * 
	 * Pajak dihitung sebagai 5% dari penghasilan bersih tahunan (gaji dan pemasukan bulanan lainnya dikalikan jumlah bulan bekerja dikurangi pemotongan) dikurangi penghasilan tidak kena pajak.
	 * 
	 * Jika pegawai belum menikah dan belum punya anak maka penghasilan tidak kena pajaknya adalah Rp 54.000.000.
	 * Jika pegawai sudah menikah maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000.
	 * Jika pegawai sudah memiliki anak maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000 per anak sampai anak ketiga.
	 * 
	 */
	private static final int BASIC_NON_TAXABLE_INCOME = 54000000;
    private static final int MARRIAGE_DEDUCTION = 4500000;
    private static final int CHILD_DEDUCTION = 1500000;
    private static final double TAX_RATE = 0.05;
    private static final int MAX_CHILDREN_DEDUCTION = 3;
    private static final int MAX_WORKING_MONTHS = 12;
	
	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
		
		if (numberOfMonthWorking > MAX_WORKING_MONTHS) {
			System.err.println("More than 12 month working per year");
		}
		
		if (numberOfChildren > MAX_CHILDREN_DEDUCTION) {
		    numberOfChildren = MAX_CHILDREN_DEDUCTION;
		}

		int nonTaxable = BASIC_NON_TAXABLE_INCOME;
		if (isMarried) {
		    nonTaxable += MARRIAGE_DEDUCTION + (numberOfChildren * CHILD_DEDUCTION);
		} 

		int annualIncome = (monthlySalary + otherMonthlyIncome) * numberOfMonthWorking;
		int taxableIncome = annualIncome - deductible - nonTaxable;
		int tax = (int) Math.round(TAX_RATE * taxableIncome);
		
		if (tax < 0) {
			return 0;
		}else {
			return tax;
		}
			 
	}
	
}
