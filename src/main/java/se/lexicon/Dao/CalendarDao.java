package se.lexicon.Dao;

import se.lexicon.model.Calendar;

import java.util.Collection;
import java.util.Optional;

public interface CalendarDao {

    Calendar createCalendar(String title, String username);

    Optional<Calendar> findById(int id);

    Collection<Calendar> findCalendarByUsername(String username);

    Optional<Calendar> findByTitleAndUsername(String title, String username);

    boolean deleteCalendar(int id);

}
