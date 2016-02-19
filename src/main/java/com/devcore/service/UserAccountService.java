package com.devcore.service;

import com.devcore.entity.UserAccount;
import org.springframework.transaction.annotation.Transactional;

public interface UserAccountService {

  void createUser(String username, String password);

  UserAccount findUserByName(String name);

  UserAccount findById(Long id);
}