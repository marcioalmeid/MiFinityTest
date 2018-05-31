package ie.mam.mfinity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ie.mam.mfinity.model.User;
import ie.mam.mfinity.repository.UserRepository;

@Controller
@RequestMapping(path="/home")
public class UserController{
  @Autowired
  private UserRepository userRepository;
  
  @GetMapping(path="add")
  public @ResponseBody String addNewUser(@RequestParam String userName, @RequestParam String password){
    User user=new User( userName, password) ;
    userRepository.save(user);
    
    return "Saved";
     
  }
      
  
@GetMapping(path="/all")
@CrossOrigin(origins = "http://marcioalmeidamendes.ml:4200")
  public @ResponseBody Iterable<User> getAllUsers(){
    return userRepository.findAll();
 }
  
}



