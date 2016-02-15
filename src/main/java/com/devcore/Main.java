package com.devcore;

import com.devcore.dao.UserAccountDao;
import com.devcore.entity.UserAccount;
import com.devcore.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Точка входа
 */
public class Main {


  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    context.refresh();

//    UserAccountService userAccountService = (UserAccountService) context.getBean("userAccountService");
//    userAccountService.createUser("Evgeny", "ajsgjdsafHJGsd");

    UserAccountDao userAccountDao = (UserAccountDao) context.getBean("userAccountDao");
    System.out.println(userAccountDao.loadUserByUserName("Evgeny").toString());
    Long id = userAccountDao.countAll();

  }

}