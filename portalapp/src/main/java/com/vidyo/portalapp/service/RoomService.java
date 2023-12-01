package com.vidyo.portalapp.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidyo.portalapp.entity.Room;
import com.vidyo.portalapp.repository.RoomRepository;

@Service
public class RoomService {
	
	@Autowired
	private RoomRepository roomRepository;

	public Room searchRoomByRoomName(String roomName) {
		return roomRepository.searchRoomByRoomName(roomName);
	}

	public void save(Room room) {
		roomRepository.save(room);
	}

}
