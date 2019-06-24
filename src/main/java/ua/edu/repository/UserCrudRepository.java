package ua.edu.repository;

import org.springframework.data.repository.CrudRepository;
import ua.edu.data.User;

public interface UserCrudRepository extends CrudRepository<User, Long> {}
