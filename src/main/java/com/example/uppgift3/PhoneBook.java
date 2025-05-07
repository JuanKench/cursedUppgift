package com.example.uppgift3;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class PhoneBook {

    private String name;
    private int number;
    private int id;


    public PhoneBook(String name, int number, int id) {
        this.name = name;
        this.number = number;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getId() {
        return id;
    }

}
