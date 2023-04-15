package Tax;

public class TaxPayer {
	private Double salaryInCome;
	private Double servicesInCome;
	private Double capitalInCome;
	private Double healthSpending;
	private Double educationSpending;

	public TaxPayer(Double salaryInCome, Double servicesInCome, Double capitalInCome, Double healthSpending,
			Double educationSpending) {
		this.salaryInCome = salaryInCome;
		this.servicesInCome = servicesInCome;
		this.capitalInCome = capitalInCome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public Double getSalaryInCome() {
		return salaryInCome;
	}

	public void setSalaryInCome(Double salaryInCome) {
		this.salaryInCome = salaryInCome;
	}

	public Double getServicesInCome() {
		return servicesInCome;
	}

	public void setServicesInCome(Double servicesInCome) {
		this.servicesInCome = servicesInCome;
	}

	public Double getCapitalInCome() {
		return capitalInCome;
	}

	public void setCapitalInCome(Double capitalInCome) {
		this.capitalInCome = capitalInCome;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public Double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}

	public double salaryTax() {
		Double monthlySalary = salaryInCome / 12;
		if (monthlySalary < 3000.0) {
			System.out.println(" Você esta isento de IMPOSTOS ");
		} else if (monthlySalary > 3000.0 && monthlySalary < 5000.0) {
			return salaryInCome * 0.10;
		} else {
			return salaryInCome * 0.20;
		}
		return 0;
	}

	public double servicesTax() {
		return servicesInCome * 0.15;
	}

	public double capitalTax() {
		return capitalInCome * 0.20;
	}

	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}
	
	public double taxRebate() {
		double taxEducationHealt = educationSpending + healthSpending;
		double trintaGrossTax = grossTax() * 0.30;
		double abatement = Math.min(taxEducationHealt, trintaGrossTax);
		return abatement;		
	}						
	public double netTax() {
		return grossTax()-taxRebate()  ;
	}
}
