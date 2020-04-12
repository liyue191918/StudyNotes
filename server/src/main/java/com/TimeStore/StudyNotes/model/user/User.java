package com.TimeStore.StudyNotes.model.user;

import java.io.Serializable;
import java.util.Date;

import lombok.*;

public class User implements Serializable {
	
	@Getter @Setter private String userId;
	@Getter @Setter private String password;
	@Getter @Setter private String ip;
	@Getter @Setter private String firstName;
	@Getter @Setter private String lastName;
	@Getter @Setter private String email;
	@Getter @Setter private String profilePhoto;
	@Getter @Setter private Date registrationTime;
	@Getter @Setter private Date birthday;
	@Getter @Setter private Integer age;
	@Getter @Setter private String telephoneNumber;
	@Getter @Setter private String nickname;
	@Getter @Setter private Role role;
	@Getter @Setter private boolean isActive;     

    public User(){
        this("new", "PASSWORD",Role.USER, "", "new", "new", "", "", new Date(), new Date(), 0, "", ""  , true);
    }

    public User(String userId, String password, String firstName, String lastName){
        this(userId, password,Role.USER, "", firstName, lastName, "", "", new Date(), new Date(), 0, "", "" , true);
        
    }

    public User(String userId, String password, Role role, String firstName, String lastName){
        this(userId, password,role, "", firstName, lastName, "", "", new Date(), new Date(), 0, "", "" , true);
    }

    public User(String userId, String password, Role role, String firstName, String lastName, boolean isActive){
        this(userId, password,role, "", firstName, lastName, "", "", new Date(), new Date(), 0, "", "" , isActive);
    }

    public User(String userId, String password, Role role, String ip, String firstName, String lastName,String email,String profilePhoto,
        Date registrationTime,Date birthday,Integer age,String telephoneNumber,String nickname,  boolean isActive
         ){
        this.setUserId(userId);
        this.setEmail(email);
        this.setPassword(password);
        this.setRole(role);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setActive(isActive);
        this.setIp(ip);
        this.setProfilePhoto(profilePhoto);
        this.setRegistrationTime(registrationTime);
        this.setBirthday(birthday);
        this.setAge(age);
        this.setTelephoneNumber(telephoneNumber);
        this.setNickname(nickname);
    }


    public String getFullName(){
        return this.firstName + this.lastName;
    }
}
