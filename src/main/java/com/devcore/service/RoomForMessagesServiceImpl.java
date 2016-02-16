package com.devcore.service;

import com.devcore.dao.RoomForMessagesDao;
import com.devcore.entity.RoomForMessages;
import com.devcore.entity.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Реализация для комнат
 */
@Service("roomForMessagesService")
public class RoomForMessagesServiceImpl implements RoomForMessagesService {

  @Autowired
  private RoomForMessagesDao roomForMessagesDao;

  @Override
  public void createRoom(String caption, String description, UserAccount userAccount) {
    RoomForMessages roomForMessages = new RoomForMessages();
    roomForMessages.setCaption(caption);
    roomForMessages.setDescription(description);
    roomForMessages.setCreateDate(new Date());
    roomForMessages.setUserAccount(userAccount);

    roomForMessagesDao.create(roomForMessages);
  }
}