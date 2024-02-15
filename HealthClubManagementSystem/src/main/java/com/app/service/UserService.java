package com.app.service;

import java.util.List;

import com.app.dto.RegisterUserDTO;
import com.app.dto.ApprovedDTO;
import com.app.entities.User;
import com.app.enums.Role;
import com.app.enums.Status;

public interface UserService {

    RegisterUserDTO registerUser(RegisterUserDTO details);

    List<User> getPendingUsersList();

    Status getUserStatus(String email);

    Role getUserRole(String email);

    ApprovedDTO approveUsers(ApprovedDTO approved);

    List<User> getCustomerList();

    List<User> getTrainerList();

    void resetPassword(String email, String newPassword);

    User findUserByEmail(String email);


}
