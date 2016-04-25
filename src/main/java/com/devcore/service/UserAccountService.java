package com.devcore.service;

import com.devcore.entity.UserAccount;

public interface UserAccountService {

  void createUser(String username, String password);

  UserAccount findUserByName(String name);

  UserAccount findById(UserAccount id);
}