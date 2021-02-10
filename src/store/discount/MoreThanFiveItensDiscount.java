package store.discount;

import java.math.BigDecimal;

import store.budget.Budget;

public class MoreThanFiveItensDiscount extends Discount {
	
	public MoreThanFiveItensDiscount(Discount next) {
		super(next);
	}

	public BigDecimal calculate(Budget budget) {
		if (budget.getNumberOfItens() > 5) {
			return budget.getValue().multiply(new BigDecimal("0.1"));
		}
		
		return next.calculate(budget);
	}

}
