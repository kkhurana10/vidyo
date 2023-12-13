/**
 * 
 */
package com.vidyo.moderatorapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomDto {
	
	private String roomUrl;
	private String extension;
	private String pin;

}
