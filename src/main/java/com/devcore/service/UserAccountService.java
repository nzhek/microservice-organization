package com.devcore.service;

import org.springframework.transaction.annotation.Transactional;

public interface UserAccountService {
  @Transactional
  void createUser(String username, String password);
}
