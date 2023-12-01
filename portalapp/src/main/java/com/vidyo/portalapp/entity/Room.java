package com.vidyo.portalapp.entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "room", schema = "vidyo")
public class Room implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2836344411351326354L;

	@Id
	@Column(name = "room_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roomID;

	@Column(name = "room_name")
	private String roomName;

	@Column(name = "room_key")
	private String roomKey;

	@Column(name = "room_url")
	private String roomURL;

	@Column(name = "portal")
	private String portal;

	@Column(name = "entity_id")
	private String entityID;

	@Column(name = "extension")
	private String extension;

	@Column(name = "pin")
	private String pin;

	@Column(name = "owner_entity_id")
	private String ownerEntityID;

	@Column(name = "owner_name")
	private String ownerName;

	@Column(name = "user_date")
	private Date userDate;

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

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
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
