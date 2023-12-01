package com.vidyo.moderatorapp.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidyo.moderatorapp.entity.Room;
import com.vidyo.moderatorapp.repository.RoomRepository;

@Service
public class RoomService {

	@Autowired
	private RoomRepository roomRepository;

	public List<Room> findByUserDate(Date userDate) {
		return roomRepository.findByUserDate(userDate);
	}

}
