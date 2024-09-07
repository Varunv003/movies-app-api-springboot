package com.movies.moviesapi.repository;

import com.movies.moviesapi.model.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository  extends MongoRepository<Review, ObjectId> {
}
