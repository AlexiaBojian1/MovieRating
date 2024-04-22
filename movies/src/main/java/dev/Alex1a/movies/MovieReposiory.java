package dev.Alex1a.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieReposiory extends MongoRepository<Movie, ObjectId> {
}
