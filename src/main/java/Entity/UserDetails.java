package Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "userdetails")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "userid")
    private Long userId;

    @Column(name = "email",nullable = false,unique = true)
    private String email;

    @Column(name = "phonenumber",nullable = false,unique = true)
    private Long phoneNumber;

    @Column(name = "firstname",nullable = false)
    private String firstName;

    @Column(name = "lastname",nullable = false)
    private String lastName;

    @Column(name = "dateofbirth",nullable = false)
    private String dateOfBirth;

    @Column(name = "gender")
    private String gender;

    @Column(name = "phoneverified")
    private Boolean phoneVerified;

    @Column(name = "emailverified")
    private Boolean emailVerified;

    @Column(name = "createdat",nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "lastlogin",nullable = false)
    private LocalDateTime lastLogin;

    @Column(name = "passwordhash",nullable = false)
    private String passwordHash;

    // Getters
    public Long getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }
    public Long getPhoneNumber() {
        return phoneNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getGender() {
        return gender;
    }
    public Boolean getPhoneVerified() {
        return phoneVerified;
    }
    public Boolean getEmailVerified() {
        return emailVerified;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public LocalDateTime getLastLogin() {
        return lastLogin;
    }
    public String getPasswordHash() {
        return passwordHash;
    }

    // Setters
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public void setEmail(String email) {
        this.email = email;

    }
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setPhoneVerified(Boolean phoneVerified) {
        this.phoneVerified = phoneVerified;
    }
    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;

    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;

    }
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
}

