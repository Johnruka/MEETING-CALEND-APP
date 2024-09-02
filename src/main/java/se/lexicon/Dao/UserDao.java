package se.lexicon.Dao;

import se.lexicon.model.User;

import java.util.Optional;

public interface UserDao {

    User createUser(String username);

    Optional<User> finByUsername(String username);

    boolean authenticate(User user) throws AuthenticationFailedException, UserExpiredException;

}
