package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping")
public class MappingClassController {
    @GetMapping("/users")
    public String users(){
        return "get users";
    }

    @PostMapping("/users")
    public String addUser(){
        return "post user";
    }

    @GetMapping("/users/{userId}")
    public String findUser(@PathVariable("userId") String userId){
        return "get userId= " + userId;
    }

    @PatchMapping("/users/{userId}")
    public String updateUser(@PathVariable("userId") String userId){
        return "update userId= " + userId;
    }

    @DeleteMapping("/mapping/users/{userId}")
    public String deleteUser(@PathVariable("userId") String userId){
        return "delete userId= " + userId;
    }
}
