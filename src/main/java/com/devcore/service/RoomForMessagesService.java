package com.devcore.service;

import com.devcore.entity.RoomForMessages;
import com.devcore.entity.UserAccount;
import org.springframework.transaction.annotation.Transactional;

/**
 * Сервис для комнат сообщений
 */
public interface RoomForMessagesService {
  @Transactional
  void createRoom(String caption, String description, UserAccount userAccount);

  @Transactional
  RoomForMessages findById(Long id);
}