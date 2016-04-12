package com.devcore.entity;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Сущность для Сообщений
 */
@Entity
public class Messages extends BaseEntity {

  private String message;
  private Date createDate;

  @ManyToOne
  private UserAccount userAccount;
  @ManyToOne
  private RoomForMessages roomForMessages;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public UserAccount getUserAccount() {
    return userAccount;
  }

  public void setUserAccount(UserAccount userAccount) {
    this.userAccount = userAccount;
  }

  public RoomForMessages getRoomForMessages() {
    return roomForMessages;
  }

  public void setRoomForMessages(RoomForMessages roomForMessages) {
    this.roomForMessages = roomForMessages;
  }
}
