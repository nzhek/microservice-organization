package com.devcore.dao;

import com.devcore.entity.Messages;
import com.devcore.entity.RoomForMessages;

import java.util.List;

/**
 * Dao для сообщений
 */
public interface MessagesDao extends GenericDao<Messages> {
  List<Messages> printAllMessagesFromRoom(RoomForMessages roomId);
}
