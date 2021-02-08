package store.tax;

import java.math.BigDecimal;

import store.budget.Budget;

public class TaxesCalculator {

	public BigDecimal calculate(Budget budget, Tax tax) {
		return tax.calculate(budget);
	}

}
