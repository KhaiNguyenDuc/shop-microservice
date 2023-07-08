package com.khai.product.repository;

import com.khai.product.model.Mattress;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MattressRepository extends MongoRepository<Mattress, String>
{
}
