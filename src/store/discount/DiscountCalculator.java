package store.discount;

import java.math.BigDecimal;

import store.budget.Budget;

public class DiscountCalculator {

	public BigDecimal calculate(Budget budget) {
		
		Discount discount = new MoreThanFiveItensDiscount(new BudgetValueHigherThanFiveHundred(
						new DiscountNotAllowed()));
		
		return discount.calculate(budget);
	}
}
