package store.discount;

import java.math.BigDecimal;

import store.budget.Budget;

public class BudgetValueHigherThanFiveHundred extends Discount {
	
	public BudgetValueHigherThanFiveHundred(Discount next) {
		super(next);
	}

	public BigDecimal calculate(Budget budget) {
		if (budget.getValue().compareTo(new BigDecimal("500")) > 0) {
			return budget.getValue().multiply(new BigDecimal("0.05"));
		}
		
		return next.calculate(budget);
	}

}
