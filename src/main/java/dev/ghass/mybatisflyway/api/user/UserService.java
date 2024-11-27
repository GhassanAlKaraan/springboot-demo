package dev.ghass.mybatisflyway.api.user;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public List<User> getUsers() {
    return this.userRepository.selectAll();
  }

  public User getUserById(@PathVariable("id") UUID id) {
    return this.userRepository.selectById(id);
  }

  public void addUser(@RequestBody User user) {
    this.userRepository.insert(user);
  }

  public void deleteUserById(@PathVariable("id") UUID id) {
    this.userRepository.deleteById(id);
  }

}
