package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OwnerBook {

    private String name;
    private int age;
    @Qualifier("info")
    @Autowired
    private Book book;

    public String getInfo(){
        return "Name: " + name + " Age: " + age + " Book: " + book.getTitle() + " Author: " + book.getAuthor();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
