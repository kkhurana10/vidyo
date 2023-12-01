package com.vidyo.portalapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vidyo.portalapp.dto.RoomDto;
import com.vidyo.portalapp.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {

	Room searchRoomByRoomName(String roomName);

}