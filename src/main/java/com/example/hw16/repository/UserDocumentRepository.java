package com.example.hw16.repository;

import com.example.hw16.repository.documents.UserDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserDocumentRepository extends MongoRepository<UserDocument, Long> {

    Optional<UserDocument> findUsersByFirstName(String firstName);
    Optional<UserDocument> findUsersByLastName(String lastName);
    Optional<UserDocument> findByEmail(String email);
    Optional<UserDocument> findUsersByAgeGreaterThan(int age);
    Optional<UserDocument> findUsersByMarried(boolean isMarried);
}
