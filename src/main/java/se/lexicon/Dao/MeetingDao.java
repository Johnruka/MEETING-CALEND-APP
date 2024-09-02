package se.lexicon.Dao;

import se.lexicon.model.Meeting;

import java.util.Collection;
import java.util.Optional;

public interface MeetingDao {

    Meeting createMeeting(Meeting meeting);

    Optional<Meeting> findById(int meetingId);

    //select * from meeting
    Collection<Meeting> findAllMeetingsByCalendarId(int calendarId);

    boolean deleteMeeting(int meetingId);

    //todo Add methods for updating calendars as needed
}
