package com.devcore.dao;

import com.devcore.entity.Messages;
import org.springframework.stereotype.Component;

/**
 * Реализация Dao для сообщений
 */
@Component("messagesDao")
public class MessagesDaoImpl extends GenericDaoImpl<Messages> implements MessagesDao {
  public MessagesDaoImpl() {
    super();
  }
}
