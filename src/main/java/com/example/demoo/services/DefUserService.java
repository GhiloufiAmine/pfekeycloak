package com.example.demoo.services;

import com.example.demoo.domain.DefUser;
import com.example.demoo.exceptions.domain.EmailExistException;
import com.example.demoo.exceptions.domain.EmailNotFoundException;
import com.example.demoo.exceptions.domain.UserNotFoundException;
import com.example.demoo.exceptions.domain.UsernameExistException;

import javax.mail.MessagingException;
import java.util.List;

public interface DefUserService {
    DefUser register(String Username, String Email) throws EmailExistException,
            UsernameExistException,
            UserNotFoundException,
            MessagingException;

    List<DefUser> getUsers();

    DefUser findDefUserByUsername(String username);

    DefUser findDefUserByEmail(String email);

    DefUser getLoggedInUser();

    DefUser addNewUser(String username, String email, String role, boolean isNotLocked, boolean isActive) throws EmailExistException, UsernameExistException;

    DefUser updateUser(String currentUsername, String newUsername, String newEmail, String role, boolean isNotLocked,
                       boolean isActive) throws EmailExistException, UsernameExistException;

    void deleteUser(long user_id);

    void resetPassword(String email) throws EmailNotFoundException, MessagingException;
}