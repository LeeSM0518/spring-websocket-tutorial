package com.example.chattingserver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ChatRoomRepository {

  private Map<String, ChatRoom> chatRoomMap = new LinkedHashMap<>();

  public List<ChatRoom> findAllRoom() {
    final ArrayList<ChatRoom> chatRooms = new ArrayList<>(chatRoomMap.values());
    Collections.reverse(chatRooms);
    return chatRooms;
  }

  public ChatRoom findRoomById(String id) {
    return chatRoomMap.get(id);
  }

  public ChatRoom createChatRoom(String name) {
    ChatRoom chatRoom = new ChatRoom(name);
    chatRoomMap.put(chatRoom.getRoomId(), chatRoom);
    return chatRoom;
  }

}
