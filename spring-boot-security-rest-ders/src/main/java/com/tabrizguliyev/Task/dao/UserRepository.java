package com.tabrizguliyev.Task.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tabrizguliyev.Task.entities.User;
import java.util.List;

/**
 *
 * @author tabrizguliyev
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public List<User> findUserByNameAndSurname(String name, String surname);
}
