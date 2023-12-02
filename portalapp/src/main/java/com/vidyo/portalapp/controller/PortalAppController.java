package com.vidyo.portalapp.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vidyo.portalapp.client.SoapClient;
import com.vidyo.portalapp.entity.Room;
import com.vidyo.portalapp.service.RoomService;
import com.vidyo.portalapp.wsdl.CreateScheduledRoomRequest;
import com.vidyo.portalapp.wsdl.CreateScheduledRoomResponse;

import io.micrometer.common.util.StringUtils;

@RestController
@RequestMapping("/portal-app")
public class PortalAppController {

	@Autowired
	private SoapClient client;

	@Autowired
	private RoomService roomService;

	@PostMapping("/createScheduledRoom")
	public CreateScheduledRoomResponse createScheduledRoom(@RequestBody CreateScheduledRoomRequest request) {
		CreateScheduledRoomResponse response = new CreateScheduledRoomResponse();
		response = client.createScheduledRoom(request);
		String roomName = "";
		if (StringUtils.isNotEmpty(response.getRoomURL()) && response.getRoom() != null) {
			Room room = new Room();

			room.setRoomName(roomName);
			room.setRoomKey(response.getRoomURL().split("/join/")[1]);
			room.setRoomURL(response.getRoomURL());
			room.setPortal(response.getRoomURL().split("/join/")[0]);
			room.setEntityID(response.getRoom().getEntityID());
			room.setExtension(response.getExtension());
			room.setPin(response.getPin());
			room.setOwnerEntityID(response.getRoom().getOwnerEntityID());
			room.setOwnerName(response.getRoom().getOwnerName());
			room.setUserDate(new Date(System.currentTimeMillis()));

			roomService.save(room);
		}
		return response;
	}

	@GetMapping("/searchRooms")
	public Room searchRoomByRoomName(@RequestParam(value = "roomName") String roomName) {
		Room room = roomService.searchRoomByRoomName(roomName);
		return room;
	}
}
