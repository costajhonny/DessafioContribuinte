package Contribuinte;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import Tax.TaxPayer;

public class Contribuintes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 List <TaxPayer> list = new ArrayList<>();
		 
		 System.out.print("Quantos contribuintes você vai digitar ?");
		 int n = sc.nextInt();		 
		 for (int i=0 ; i<n ;i++ ) {		
			 System.out.println("Digite os dados do " +(i+1)+ " o contribuinte:");
			 System.out.print("Renda anual com salário:");		
			 double salaryInCome = sc.nextDouble();
			 System.out.print("Renda anual com prestação de serviço:");
			 double servicesInCome = sc.nextDouble();
			 System.out.print("Renda anual com ganho de capital:");
			 double capitalInCome = sc.nextDouble();
			 System.out.print("Gastos médicos:");
			 double healthSpending = sc.nextDouble();
			 System.out.print("Gastos educacionais:");
			 double educationSpending = sc.nextDouble();			 
			list.add(new TaxPayer(salaryInCome, servicesInCome, capitalInCome, healthSpending, educationSpending));
		 }
		 System.out.println();
		 
		 for (int i=0 ; i<n ;i++ ) {
			 System.out.println("Resumo do " +(i+1)+"o contribuinte");	
			 System.out.printf("Imposto bruto total : %.2f%n ",list.get(i).grossTax());
			 System.out.printf("Abatimento : %.2f%n ", list.get(i).taxRebate());
			 System.out.printf("Imposto devido : %.2f%n ",list.get(i).netTax());
			 System.out.println();
		 }		
		sc.close();

	}

}
