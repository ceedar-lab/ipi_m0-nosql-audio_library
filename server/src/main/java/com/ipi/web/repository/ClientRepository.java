package com.ipi.web.repository;

import com.ipi.web.model.Client;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ClientRepository extends MongoRepository<Client, ObjectId> {

    List<Client> findAllByClientIdIsNotNull();
}
