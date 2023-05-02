package com.example.hw16.service;

import com.example.hw16.repository.documents.UserDocument;

import java.util.List;

public interface UserDocumentService {

    UserDocument createUser(UserDocument userDocument);
    List<UserDocument> getUsersByFirstName(String firstName);
    List<UserDocument> getUsersByLastName(String lastName);
    UserDocument getByEmail(String email);
    List<UserDocument> getUsersByAgeGreaterThan(int age);
    List<UserDocument> getUsersByIsMarried(boolean isMarried);
    void deleteUserById(Long userId);
}
