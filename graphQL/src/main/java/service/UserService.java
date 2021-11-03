package service;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import javax.annotation.PostConstruct;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @PostConstruct
    public void loadData(){
        User paul = new User("Paul","Ladmirault");
        userRepository.save(paul);
    }
}
