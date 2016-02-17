package com.devcore.dao;

import com.devcore.entity.Messages;
import com.devcore.entity.RoomForMessages;
import org.springframework.stereotype.Component;

import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Реализация Dao для сообщений
 */
@Component("messagesDao")
public class MessagesDaoImpl extends GenericDaoImpl<Messages> implements MessagesDao {

  @Override
  public List<Messages> printAllMessagesFromRoom(RoomForMessages roomId) {
    TypedQuery<Messages> typedQuery =
      this.entityManager.createQuery("select m from Messages m where m.roomForMessages=:roomId", Messages.class);
    return typedQuery.setParameter("roomId", roomId).getResultList();
  }
}
