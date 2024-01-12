package openclosed.ok;

import openclosed.model.Product;

public class NewProductDiscount implements DiscountStrategy {
  @Override
  public double calculateDiscount(Product product) {
    // Custom logic for discount calculation for the new product
    return product.getPrice() * 0.15; // 15% discount for ProductC
  }
}
