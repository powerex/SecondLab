package ua.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.edu.data.User;
import ua.edu.repository.UserCrudRepository;

import java.util.Optional;

@Service
public class UserDataService {

    @Autowired
    private UserCrudRepository userCrudRepository;

    @Transactional
    public void testUserCrudRepository() {
        Optional<User> userOptional = userCrudRepository.findById(1L);
    }
}
