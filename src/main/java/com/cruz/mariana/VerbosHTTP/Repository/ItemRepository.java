package com.cruz.mariana.VerbosHTTP.Repository;

import com.cruz.mariana.VerbosHTTP.Model.GroceryItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<GroceryItem, String> {

}
