package com.svit.ecommerce.repository;

import com.svit.ecommerce.model.OrderProduct;
import com.svit.ecommerce.model.OrderProductPK;

import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
