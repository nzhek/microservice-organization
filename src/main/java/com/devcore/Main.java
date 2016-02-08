package com.devcore;

import com.devcore.entity.Family;
import com.devcore.entity.FamilyDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Точка входа
 */
public class Main {

  public static  void main(String[] args){

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//    FamilyDao dao = context.getBean(FamilyDao.class);
//
//    Family family = new Family();
//    family.setFamilyMembersAmount(5);
//    dao.save(family);
  }
}
