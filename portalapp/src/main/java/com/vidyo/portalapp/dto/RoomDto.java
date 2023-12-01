package com.vidyo.portalapp.dto;

import java.io.Serializable;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2763753437437295608L;
	private Integer roomID;
	private String roomName;
	private String roomKey;
	private String roomURL;
	private String portal;
	private String entityID;
	private String extension;
	private String pin;
	private String ownerEntityID;
	private String ownerName;
	private Date userDate;
	
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public Integer getRoomID() {
		return roomID;
	}
	public void setRoomID(Integer roomID) {
		this.roomID = roomID;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomKey() {
		return roomKey;
	}
	public void setRoomKey(String roomKey) {
		this.roomKey = roomKey;
	}
	public String getRoomURL() {
		return roomURL;
	}
	public void setRoomURL(String roomURL) {
		this.roomURL = roomURL;
	}
	public String getPortal() {
		return portal;
	}
	public void setPortal(String portal) {
		this.portal = portal;
	}
	public String getEntityID() {
		return entityID;
	}
	public void setEntityID(String entityID) {
		this.entityID = entityID;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getOwnerEntityID() {
		return ownerEntityID;
	}
	public void setOwnerEntityID(String ownerEntityID) {
		this.ownerEntityID = ownerEntityID;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Date getUserDate() {
		return userDate;
	}
	public void setUserDate(Date userDate) {
		this.userDate = userDate;
	}
}
