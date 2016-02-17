package com.devcore.dao;

import com.devcore.entity.UserAccount;
import org.springframework.stereotype.Component;

import javax.persistence.Query;

import java.util.List;

@Component("userAccountDao")
public class UserAccountDaoImpl extends GenericDaoImpl<UserAccount> implements UserAccountDao {

  @Override
  public UserAccount loadUserByUserName(String username) {
    Query query = this.entityManager.createQuery("select u from UserAccount u where u.username= :username");
    query.setParameter("username", username);
    List<UserAccount> userAccounts = query.getResultList();
    if (userAccounts != null) {
      return userAccounts.get(0);
    }
    return null;
  }
}
