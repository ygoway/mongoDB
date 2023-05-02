package com.example.hw16.service.Impl;

import com.example.hw16.repository.UserDocumentRepository;
import com.example.hw16.repository.documents.UserDocument;
import com.example.hw16.service.UserDocumentService;
import com.example.hw16.service.exception.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserDocumentServiceImpl implements UserDocumentService {

    private final UserDocumentRepository userDocumentRepository;

    public UserDocumentServiceImpl(UserDocumentRepository userDocumentRepository) {
        this.userDocumentRepository = userDocumentRepository;
    }

    @Override
    public UserDocument createUser(UserDocument userDocument) {
        return userDocumentRepository.save(userDocument);
    }

    @Override
    public List<UserDocument> getUsersByFirstName(String firstName) {
        return userDocumentRepository.findUsersByFirstName(firstName).stream().collect(Collectors.toList());
    }

    @Override
    public List<UserDocument> getUsersByLastName(String lastName) {
        return userDocumentRepository.findUsersByLastName(lastName).stream().collect(Collectors.toList());
    }

    @Override
    public UserDocument getByEmail(String email) {
        return userDocumentRepository.findByEmail(email)
                .orElseThrow(() -> new NotFoundException("User with email : " + email + " not found"));
    }

    @Override
    public List<UserDocument> getUsersByAgeGreaterThan(int age) {
        return userDocumentRepository.findUsersByAgeGreaterThan(age).stream().collect(Collectors.toList());
    }

    @Override
    public List<UserDocument> getUsersByIsMarried(boolean isMarried) {
        return userDocumentRepository.findUsersByMarried(isMarried).stream().collect(Collectors.toList());
    }

    @Override
    public void deleteUserById(Long userId) {
        if (userDocumentRepository.existsById(userId)) {
            userDocumentRepository.deleteById(userId);
        } else {
            throw new NotFoundException("User with id : " + userId + " not found");
        }
    }
}
