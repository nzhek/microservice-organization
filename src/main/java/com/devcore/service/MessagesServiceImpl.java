package com.devcore.service;

import com.devcore.dao.MessagesDao;
import com.devcore.entity.Messages;
import com.devcore.entity.RoomForMessages;
import com.devcore.entity.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Реализация сервиса сообщений
 */
@Service("messagesService")
public class MessagesServiceImpl implements MessagesService {

  @Autowired
  private MessagesDao messagesDao;

  @Override
  public void createMessage(String text, UserAccount userAccount, RoomForMessages roomForMessages) {
    Messages messages = new Messages();
    messages.setMessage(text);
    messages.setRoomForMessages(roomForMessages);
    messages.setUserAccount(userAccount);
    messages.setCreateDate(new Date());
    messagesDao.create(messages);
  }
}
