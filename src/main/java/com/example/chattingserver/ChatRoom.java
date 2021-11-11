package com.example.chattingserver;

import lombok.Getter;

import java.util.UUID;

@Getter
public class ChatRoom {

  private final String roomId;
  private final String name;

  public ChatRoom(final String name) {
    this.roomId = UUID.randomUUID().toString();
    this.name = name;
  }

}
