package com.reservation.dao;

import java.util.List;

import com.reservation.entity.Meeting;

public interface MeetingDAO {

	public List<Meeting> getMeetings();
	
	public void saveMeeting(Meeting theMeeting);
	
	public Meeting getMeeting(int theId);

	public void deleteMeeting(int theId);

	public List<Meeting> searchMeetings(String theSearchRoomNo);
}
