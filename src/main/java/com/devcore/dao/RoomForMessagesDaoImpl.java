package com.devcore.dao;

import com.devcore.entity.RoomForMessages;
import org.springframework.stereotype.Component;

/**
 * Реализация Dao для комнат
 */
@Component("roomForMessagesDao")
public class RoomForMessagesDaoImpl extends GenericDaoImpl<RoomForMessages> implements RoomForMessagesDao{
  public RoomForMessagesDaoImpl() {
    super();
  }
}
