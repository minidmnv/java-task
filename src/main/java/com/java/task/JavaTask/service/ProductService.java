package com.java.task.JavaTask.service;

import com.java.task.JavaTask.model.Product;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  public List<Product> filterProductsByPrice(double minPrice) {
    throw new UnsupportedOperationException("Not yet implemented");
  }

  public Map<String, List<Product>> groupProductsByCategory() {
    throw new UnsupportedOperationException("Not yet implemented");
  }

  public Map<String, Optional<Product>> getMostExpensiveProductByCategory() {
    throw new UnsupportedOperationException("Not yet implemented");
  }

  public Map<String, Double> calculateAveragePriceByCategory() {
    throw new UnsupportedOperationException("Not yet implemented");
  }

  public String getProductNamesAsCsv() {
    throw new UnsupportedOperationException("Not yet implemented");
  }

}
