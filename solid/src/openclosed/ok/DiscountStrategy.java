package openclosed.ok;

import openclosed.model.Product;

public interface DiscountStrategy {
  double calculateDiscount(Product product);
}
