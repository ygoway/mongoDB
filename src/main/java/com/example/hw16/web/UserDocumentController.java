package com.example.hw16.web;

import com.example.hw16.repository.documents.UserDocument;
import com.example.hw16.service.UserDocumentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usersDocuments")
public class UserDocumentController {

    private final UserDocumentService userDocumentService;

    public UserDocumentController(UserDocumentService userDocumentService) {
        this.userDocumentService = userDocumentService;
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity createUserDoc(@RequestBody UserDocument userDocument) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userDocumentService.createUser(userDocument));
    }

    @GetMapping("/users/{firstName}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity getUsersDocByFirstName(@PathVariable String firstName) {
        return ResponseEntity.status(HttpStatus.OK).body(userDocumentService.getUsersByFirstName(firstName));
    }

    @GetMapping("/users/{lastName}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity getUsersDocByLastName(@PathVariable String lastName) {
        return ResponseEntity.status(HttpStatus.OK).body(userDocumentService.getUsersByLastName(lastName));
    }

    @GetMapping("/users/{email}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity getUsersDocByEmail(@PathVariable String email) {
        return ResponseEntity.status(HttpStatus.OK).body(userDocumentService.getByEmail(email));
    }

    @GetMapping("/users/{age}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity getUsersDocByAgeGreaterThan(@PathVariable int age) {
        return ResponseEntity.status(HttpStatus.OK).body(userDocumentService.getUsersByAgeGreaterThan(age));
    }

    @GetMapping("/users/{isMarried}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity getUsersDocByMarried(@PathVariable boolean isMarried) {
        return ResponseEntity.status(HttpStatus.OK).body(userDocumentService.getUsersByIsMarried(isMarried));
    }

    @DeleteMapping("/delete/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity deleteUserDoc(@PathVariable Long userId) {
        userDocumentService.deleteUserById(userId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
