package ml.services;

import ml.model.Product;
import ml.model.User;

public interface ProductService {

	Product getProduct();

	User getUserById(long id);
}
