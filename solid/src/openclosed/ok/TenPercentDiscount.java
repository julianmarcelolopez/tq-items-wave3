package openclosed.ok;

import openclosed.model.Product;

public class TenPercentDiscount implements DiscountStrategy {

  @Override
  public double calculateDiscount(Product product) {
    return product.getPrice() * 0.1; // 10% discount
  }
}
