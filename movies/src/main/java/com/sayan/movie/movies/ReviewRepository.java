package com.sayan.movie.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * ReviewRepository
 */
@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

}