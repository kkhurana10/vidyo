package com.vidyo.moderatorapp.entity;

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
	private static final long serialVersionUID = 1L;

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
	private Integer pin;

	@Column(name = "owner_entity_id")
	private String ownerEntityID;

	@Column(name = "owner_name")
	private String ownerName;

	@Column(name = "user_date")
	private Date userDate;

}
