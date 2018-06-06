package ie.mam.mfinity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import ie.mam.mfinity.model.User;
import ie.mam.mfinity.repository.UserRepository;

@Controller
@RequestMapping(path="/user")
@CrossOrigin(origins = "http://marcioalmeidamendes.ml:4200")
public class UserController{
  @Autowired
  private UserRepository userRepository;



  /*
  * Add a new user to the database
  */
    @RequestMapping(value="addUser", method = RequestMethod.POST)
    public  ResponseEntity<?>  addUser(@RequestBody User user) {
	    userRepository.save(user);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }    
   
   @RequestMapping(value = "delete}", method = RequestMethod.POST)
   public ResponseEntity<?> delete(@RequestBody User user ) {
	   		 
 	        userRepository.delete(user); 	         
 	       return new ResponseEntity<Void>(HttpStatus.OK);
   } 
   
     
  @RequestMapping(value = "update/{id}", method = RequestMethod.POST)
  public @ResponseBody User update(@PathVariable("id") String id, @RequestBody User user) {
	  
        return new User("User name","password");
  }

  @GetMapping(path="/list")
  public @ResponseBody Iterable<User> getAllUsers(){
    return userRepository.findAll();
 }

}



