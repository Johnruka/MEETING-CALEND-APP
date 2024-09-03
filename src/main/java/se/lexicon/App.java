package se.lexicon;


import se.lexicon.Dao.UserDao;
import se.lexicon.Impl.UserDaoImpl;
import se.lexicon.db.CalendarDBConnection;
import se.lexicon.exception.CalendarExceptionHandler;
import se.lexicon.model.User;
import se.lexicon.util.ConsoleColors;

public class App {
    public static void main(String[] args) {

        UserDao userDAO = new UserDaoImpl(CalendarDBConnection.getConnection());
//        User user = userDAO.createUser("admin 1");
//        System.out.println("user.userInfo() = " + user.userInfo());

//        Optional<User> userOptional = userDAO.finByUsername("admin");
//        if(userOptional.isPresent()){
//            System.out.println(userOptional.get().userInfo());
//        }
        try{
            userDAO.authenticate(new User("admin 1", "0SbXryPNuG"));
            System.out.println(ConsoleColors.GREEN + "You are logged in ..." + ConsoleColors.RESET);
        }catch (Exception e) {
            CalendarExceptionHandler.handleException(e);
        }

    }
}
