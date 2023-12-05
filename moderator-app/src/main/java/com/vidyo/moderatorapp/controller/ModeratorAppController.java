package com.vidyo.moderatorapp.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vidyo.moderatorapp.client.SoapClient;
import com.vidyo.moderatorapp.entity.Room;
import com.vidyo.moderatorapp.repository.RoomRepository;
import com.vidyo.moderatorapp.wsdl.CreateScheduledRoomRequest;
import com.vidyo.moderatorapp.wsdl.CreateScheduledRoomResponse;
import com.vidyo.moderatorapp.wsdl.DisconnectConferenceAllRequest;
import com.vidyo.moderatorapp.wsdl.DisconnectConferenceAllResponse;
import com.vidyo.moderatorapp.wsdl.LogInRequest;
import com.vidyo.moderatorapp.wsdl.LogInResponse;

import io.micrometer.common.util.StringUtils;

@RestController
@RequestMapping("/moderator-app")
public class ModeratorAppController {

	@Autowired
	private SoapClient client;

	@Autowired
	private RoomRepository roomRepository;

	@GetMapping("/getLogin")
	public LogInResponse getLogin(@RequestBody LogInRequest request) {
		return client.getLogin(request);
	}

	@PostMapping("/disconnectAll")
	public DisconnectConferenceAllResponse disconnectAll(@RequestBody DisconnectConferenceAllRequest request) {
		return client.disconnectAll(request);
	}

	@GetMapping("/getActiveRooms/{date}")
	public List<Room> findByUserDateTime(@PathVariable("date") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date) {
		Date dt = Date.valueOf(date);
		List<Room> r = roomRepository.findByUserDateTime(dt);
		return r;
	}
	
	@PostMapping("/searchRooms")
	public Room searchRoomByRoomName(@RequestParam(value = "roomName") String roomName) {
		Room room = roomRepository.findByRoomName(roomName);
		if(room == null ) {
			CreateScheduledRoomRequest request = new CreateScheduledRoomRequest();
			request.setSetPIN(true);
			request.setReturnRoomDetails(true);
			
			CreateScheduledRoomResponse response = new CreateScheduledRoomResponse();
			response = client.createScheduledRoom(request);
			if (StringUtils.isNotEmpty(response.getRoomURL()) && response.getRoom() != null) {
				room = new Room();
				room.setRoomName(roomName);
				room.setRoomKey(response.getRoomURL().split("/join/")[1]);
				room.setRoomURL(response.getRoomURL());
				room.setPortal(response.getRoomURL().split("/join/")[0]);
				room.setEntityID(response.getRoom().getEntityID());
				room.setExtension(response.getExtension());
				room.setPin(response.getPin());
				room.setOwnerEntityID(response.getRoom().getOwnerEntityID());
				room.setOwnerName(response.getRoom().getOwnerName());
				room.setUserDateTime(new Date(System.currentTimeMillis()));
				
				roomRepository.save(room);
			}
		}
		return room;
	}
}
