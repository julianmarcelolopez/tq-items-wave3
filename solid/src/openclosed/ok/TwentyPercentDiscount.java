package openclosed.ok;

import openclosed.model.Product;

public class TwentyPercentDiscount implements DiscountStrategy {
  @Override
  public double calculateDiscount(Product product) {
    return product.getPrice() * 0.2; // 20% discount
  }
}
