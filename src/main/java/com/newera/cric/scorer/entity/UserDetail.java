package com.newera.cric.scorer.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Setter
@Getter
@Builder
@Entity
public class UserDetail extends Base {
    @Id
    private long id;
    private String userName;
    private String firstName;
    private String lastName;
    private String gender;
    private String dob;
    private String password;
    private String emailId;
    private String phoneNumber;
    private String uniqueIdentifier;
    private boolean isActive;
    private boolean isProfileCompleted = false;
}
