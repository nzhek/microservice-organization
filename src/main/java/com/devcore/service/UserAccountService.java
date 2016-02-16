package com.devcore.service;

import com.devcore.entity.UserAccount;
import org.springframework.transaction.annotation.Transactional;

public interface UserAccountService {
  @Transactional
  void createUser(String username, String password);

  @Transactional
  void getUsers();

  @Transactional
  UserAccount getUser(String name);
}
