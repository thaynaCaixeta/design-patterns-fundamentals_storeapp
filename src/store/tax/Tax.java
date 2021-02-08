package store.tax;

import java.math.BigDecimal;

import store.budget.Budget;

public interface Tax {
	
	BigDecimal calculate(Budget budget);
}
