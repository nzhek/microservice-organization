package com.devcore.service;

import com.devcore.dao.UserAccountDao;
import com.devcore.entity.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("userAccountService")
public class UserAccountServiceImpl implements UserAccountService {

  @Autowired
  private UserAccountDao userAccountDao;

  @Override
  public void createUser(String username, String password) {
    UserAccount userAccount = new UserAccount();
    userAccount.setUsername(username);
    userAccount.setPassword(password);
    userAccount.setCreateDate(new Date());
    userAccountDao.create(userAccount);
  }
}
