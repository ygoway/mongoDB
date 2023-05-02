package com.example.hw16.repository.documents;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users_document")
public class UserDocument {

    @Id
    private Long userDocumentId;

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isMarried;

    public UserDocument() {
    }

    public UserDocument(String firstName, String lastName, String email, int age, boolean isMarried) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isMarried = isMarried;
    }

    public UserDocument(Long userDocumentId, String firstName, String lastName, String email, int age, boolean isMarried) {
        this.userDocumentId = userDocumentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isMarried = isMarried;
    }

    public Long getUserDocumentId() {
        return userDocumentId;
    }

    public void setUserDocumentId(Long userDocumentId) {
        this.userDocumentId = userDocumentId;
    }

    public String getUserFirsName() {
        return firstName;
    }

    public void setUserFirsName(String userFirsName) {
        this.firstName = userFirsName;
    }

    public String getUserLastName() {
        return lastName;
    }

    public void setUserLastName(String userLastName) {
        this.lastName = userLastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    @Override
    public String toString() {
        return "UserDocument{" +
                "userDocumentId=" + userDocumentId +
                ", userFirsName='" + firstName + '\'' +
                ", userLastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isMarried=" + isMarried +
                '}';
    }
}
