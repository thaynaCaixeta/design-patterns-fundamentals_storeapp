package store.discount;

import java.math.BigDecimal;

import store.budget.Budget;

public class DiscountNotAllowed extends Discount {

	public DiscountNotAllowed() {
		super(null);
	}

	public BigDecimal calculate(Budget budget) {
		return BigDecimal.ZERO;
	}
	
}
