package com.devcore.service;

import com.devcore.entity.RoomForMessages;
import com.devcore.entity.UserAccount;
import org.springframework.transaction.annotation.Transactional;

/**
 * Сервис для комнат сообщений
 */
@Transactional
public interface RoomForMessagesService {

  void createRoom(String caption, String description, UserAccount userAccount);

  RoomForMessages findById(Long id);
}