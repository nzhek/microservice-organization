package com.devcore.service;

import com.devcore.dao.MessagesDao;
import com.devcore.dao.RoomForMessagesDao;
import com.devcore.dao.UserAccountDao;
import com.devcore.entity.Messages;
import com.devcore.entity.RoomForMessages;
import com.devcore.entity.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Реализация сервиса сообщений
 */
@Service("messagesService")
public class MessagesServiceImpl implements MessagesService {

  @Autowired
  private MessagesDao messagesDao;
  @Autowired
  private RoomForMessagesDao roomForMessagesDao;
  @Autowired
  private UserAccountDao userAccountDao;

  @Override
  public void createMessage(String text, UserAccount userAccount, RoomForMessages roomForMessages) {
    Messages messages = new Messages();
    messages.setMessage(text);
    messages.setRoomForMessages(roomForMessages);
    messages.setUserAccount(userAccount);
    messages.setCreateDate(new Date());
    messagesDao.create(messages);
  }

  @Override
  public List<Messages> printAllMessagesFromRoom(Long id) {
    System.out.println(" ");
    for (Messages messages : messagesDao.printAllMessagesFromRoom(roomForMessagesDao.find(id))) {
      System.out.println(messages.getMessage()
        + " | " + messages.getRoomForMessages()
        + " | " + userAccountDao.find(messages.getUserAccount().getId()).getUsername()
        + " | " + messages.getCreateDate());
    }
    return null;
  }
}