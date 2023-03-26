package com.mrtripathi.service;

import com.mrtripathi.model.UserDtls;

public interface UserService {
public UserDtls createUser(UserDtls user);
public boolean checkEmail(String email);
}
