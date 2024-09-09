package se.lexicon;


import se.lexicon.Controller.CalendarController;
import se.lexicon.Dao.CalendarDao;
import se.lexicon.Dao.MeetingDao;
import se.lexicon.Dao.UserDao;
import se.lexicon.Impl.CalendarDaoImpl;
import se.lexicon.Impl.MeetingDaoImpl;
import se.lexicon.Impl.UserDaoImpl;
import se.lexicon.db.CalendarDBConnection;
import se.lexicon.view.CalendarView;
import se.lexicon.view.CalendarViewImpl;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {

        CalendarView view = new CalendarViewImpl();
        Connection connection = CalendarDBConnection.getConnection();
        UserDao userDao = new UserDaoImpl(connection);
        CalendarDao calendarDao = new CalendarDaoImpl(connection);
        MeetingDao meetingDAO = new MeetingDaoImpl(connection);
        CalendarController controller = new CalendarController(view, userDao, calendarDao, meetingDAO);
        controller.run();


    }
}
