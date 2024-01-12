package openclosed.nook;

import openclosed.model.Product;
import openclosed.model.ProductA;
import openclosed.model.ProductB;

class Discount {
  double calculateDiscount(Product product) {
    if (product instanceof ProductA) {
      return product.getPrice() * 0.1; // 10% discount for ProductA
    } else if (product instanceof ProductB) {
      return product.getPrice() * 0.2; // 20% discount for ProductB
    }
    return 0;
  }
}
