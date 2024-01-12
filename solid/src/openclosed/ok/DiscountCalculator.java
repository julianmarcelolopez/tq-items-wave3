package openclosed.ok;

import openclosed.model.Product;

public class DiscountCalculator {
  private DiscountStrategy discountStrategy;

  // Constructor accepting a specific discount strategy
  DiscountCalculator(DiscountStrategy discountStrategy) {
    this.discountStrategy = discountStrategy;
  }

  double calculateDiscount(Product product) {
    return discountStrategy.calculateDiscount(product);
  }
}
