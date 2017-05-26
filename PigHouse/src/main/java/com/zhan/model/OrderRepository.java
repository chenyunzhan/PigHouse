package com.zhan.model;

import org.springframework.data.repository.CrudRepository;


public interface OrderRepository  extends CrudRepository<MyOrder, Long> {

}
