package com.devcore.service;

import com.devcore.entity.RoomForMessages;
import com.devcore.entity.UserAccount;
import org.springframework.transaction.annotation.Transactional;

/**
 * Сервис для сообщений
 */
public interface MessagesService {
  @Transactional
  void createMessage(String text, UserAccount userAccount, RoomForMessages roomForMessages);
}
