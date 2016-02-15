package com.devcore.dao;

import com.devcore.entity.UserAccount;

public interface UserAccountDao extends GenericDao<UserAccount> {
  UserAccount loadUserByUserName(String username);
}
