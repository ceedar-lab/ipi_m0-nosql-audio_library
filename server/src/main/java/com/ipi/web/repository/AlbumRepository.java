package com.ipi.web.repository;

import com.ipi.web.model.Album;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AlbumRepository extends MongoRepository<Album, ObjectId> {

    List<Album> findAllByTitreIsNotNull();
}
