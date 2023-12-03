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
import org.springframework.web.bind.annotation.RestController;

import com.vidyo.moderatorapp.client.SoapClient;
import com.vidyo.moderatorapp.entity.Room;
import com.vidyo.moderatorapp.repository.RoomRepository;
import com.vidyo.moderatorapp.wsdl.DisconnectConferenceAllRequest;
import com.vidyo.moderatorapp.wsdl.DisconnectConferenceAllResponse;
import com.vidyo.moderatorapp.wsdl.LogInRequest;
import com.vidyo.moderatorapp.wsdl.LogInResponse;

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
	public List<Room> findByUserDate(@PathVariable("date") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date) {
		Date dt = Date.valueOf(date);
		List<Room> r = roomRepository.findByUserDate(dt);
		return r;
	}
	
//	@GetMapping("/getActiveRoom/{id}")
//	public Room findById(@PathVariable("id") Integer id) {
//		Optional<Room> r = roomRepository.findById(id);
//		return r.get();
//	}
}
