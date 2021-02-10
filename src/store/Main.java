import java.math.BigDecimal;

import store.budget.Budget;
import store.tax.ISS;
import store.tax.TaxesCalculator;

public class Main {
	public static void main(String[] args) {
		Budget budget = new Budget(new BigDecimal("100"));
		TaxesCalculator calculator = new TaxesCalculator();
		System.out.println(calculator.calculate(budget, new ISS()));
	}
}
