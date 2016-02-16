package com.devcore.service;

import com.devcore.dao.UserAccountDao;
import com.devcore.entity.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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

  @Override
  public void getUsers() {
    List<UserAccount> userAccounts = userAccountDao.getAll();
    for (UserAccount item : userAccounts) {
      System.out.println(
        item.getId() +
          " | " + item.getCreateDate() +
          " | " + item.getUsername() +
          " | " + item.getPassword() +
          " | " + item.getPhone() +
          " | " + item.getEmail());
    }
  }

  @Override
  public UserAccount findUserByName(String name) {
    return userAccountDao.loadUserByUserName(name);
  }

  @Override
  public UserAccount findById(Long id) {
    return userAccountDao.find(id);
  }
}
