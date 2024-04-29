package com.reservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reservation.dao.MeetingDAO;
import com.reservation.entity.Meeting;

@Service
public class MeetingServiceImpl implements MeetingService {

	// need inject meeting dao
	@Autowired
	private MeetingDAO meetingDAO;
	
	@Override
	@Transactional
	public List<Meeting> getMeetings() {
		return meetingDAO.getMeetings();
	}

	@Override
	@Transactional
	public void saveMeeting(Meeting theMeeting) {
		
		meetingDAO.saveMeeting(theMeeting);
	}

	@Override
	@Transactional
	public Meeting getMeeting(int theId) {
		
		return meetingDAO.getMeeting(theId);
	}

	@Override
	@Transactional
	public void deleteMeeting(int theId) {
		
		meetingDAO.deleteMeeting(theId);
	}

	@Override
	@Transactional
	public List<Meeting> searchMeetings(String theSearchRoomNo) {
		
		return meetingDAO.searchMeetings(theSearchRoomNo);
	}

}
