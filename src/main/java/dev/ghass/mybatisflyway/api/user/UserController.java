package dev.ghass.mybatisflyway.api.user;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("")
  public List<User> getUsers() {
    return this.userService.getUsers();
  }

  @GetMapping("{id}")
  public User getUserById(@PathVariable("id") UUID id) {
    return this.userService.getUserById(id);
  }

  @PostMapping("")
  public void addUser(@RequestBody User user) {
    this.userService.addUser(user);
  }

  @DeleteMapping("{id}")
  public void deleteUserById(@PathVariable("id") UUID id) {
    this.userService.deleteUserById(id);
  }

}
