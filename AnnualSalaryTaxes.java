
package annualsalarytaxes;

public class AnnualSalaryTaxes {

    public static void main(String[] args) {
        
        int monthlysalary = 900;
        double monthlyTaxes = (900*0.09);
        double taxedSalary = (900 - monthlyTaxes);
//        System.out.println(monthlyTaxes);
        double annualSalary = taxedSalary * 12 ;
        double annualTaxes = monthlyTaxes * 12 ;
        
        System.out.println("You make " + annualSalary + "$ per year");
        System.out.println("You pay for taxes " + annualTaxes +"$ per year");
        
//        double checkTaxes = (900*12)*0.09;
//        System.out.println(checkTaxes);
//        System.out.println("annual salary" + ((900*12)-checkTaxes));

    }
    
}
