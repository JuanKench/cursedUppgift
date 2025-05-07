package com.example.uppgift3;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ServiceLoader;

@RestController
public class PhoneBookController {
    KompisDAO kd = new KompisDAO();
    List<PhoneBook> list = kd.getAllKompis();

    @RequestMapping("/Friends")
    public List<PhoneBook> getAllFriends() {
        return list;
    }

    @RequestMapping("/Friends/id/{id}")
    public PhoneBook getFriendFromId(@PathVariable int id) {
        return list.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    @RequestMapping("/Friends/name/{name}")
    public PhoneBook getFriendsFromName(@PathVariable String name) {
        return list.stream().filter(b-> b.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

}
