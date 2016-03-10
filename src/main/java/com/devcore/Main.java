package com.devcore;

import com.devcore.service.MessagesService;
import com.devcore.service.RoomForMessagesService;
import com.devcore.service.UserAccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Точка входа
 */
public class Main {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    //context.refresh();
   /*UserAccountService userAccountService = (UserAccountService) context.getBean("userAccountService");
    userAccountService.createUser("Evgeny", "555ajsgjdsafHJGsd");
    userAccountService.createUser("Vasya", "ajsgjdsafHJGsd");
    userAccountService.createUser("Boris", "ajsgjdkjgJGsd");
    userAccountService.createUser("Georgy", "KHGJ546dsafHJGsd");

    RoomForMessagesService roomForMessagesService = (RoomForMessagesService) context.getBean("roomForMessagesService");
    roomForMessagesService.createRoom("room one", "room descr descr descr", userAccountService.findUserByName("Vasya"));
    roomForMessagesService.createRoom("room two", "two two two two two two", userAccountService.findUserByName("Evgeny"));
    roomForMessagesService.createRoom("room three", "three three three three three", userAccountService.findById(3L));
    roomForMessagesService.createRoom("room four", "four four four four four four", userAccountService.findById(4L));

    MessagesService messagesService = (MessagesService) context.getBean("messagesService");
    if (roomForMessagesService.findById(6L) != null) {
      messagesService.createMessage("lalala tralala 1111", userAccountService.findUserByName("Vasya"), roomForMessagesService.findById(6L));
      messagesService.createMessage("lalala tralala 2222", userAccountService.findUserByName("Vasya"), roomForMessagesService.findById(6L));
      messagesService.createMessage("lalala tralala 333112", userAccountService.findUserByName("Vasya"), roomForMessagesService.findById(6L));
      messagesService.createMessage("lalala tralalajhsdf dfskb", userAccountService.findUserByName("Evgeny"), roomForMessagesService.findById(5L));
      messagesService.createMessage("lalala tralalaHGKJ jKHFGH", userAccountService.findUserByName("Evgeny"), roomForMessagesService.findById(5L));
      messagesService.createMessage("KJGHJKL lalala tralala", userAccountService.findUserByName("Evgeny"), roomForMessagesService.findById(5L));
      messagesService.createMessage("lalala kjHLKJGOl kljgh tralala", userAccountService.findUserByName("Evgeny"), roomForMessagesService.findById(5L));
      messagesService.createMessage("lalala 66666 tralala 555555", userAccountService.findUserByName("Evgeny"), roomForMessagesService.findById(5L));
    }

    messagesService.printAllMessagesFromRoom(5L);*/

    // научиться делать раздельный вывод по катагориям
    // создать сервлеты
    // создать формы для постинга сообщений
    // аутентификация и регистрация сделать
    // валидация форм

  }

}