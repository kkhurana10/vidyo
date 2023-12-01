package com.vidyo.moderatorapp.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vidyo.moderatorapp.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {

	List<Room> findByUserDate(Date userDate);
//    @Query(value = "SELECT R FROM Room R WHERE R.userDate = :date")
//    List<Room> findByUserDate(@Param("date") Date date);

}
