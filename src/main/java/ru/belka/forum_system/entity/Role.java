//package ru.belka.forum_system.entity;
//
//import com.fasterxml.jackson.annotation.JsonTypeName;
//import jakarta.persistence.*;
//import org.springframework.boot.autoconfigure.web.WebProperties;
//
//import java.util.Set;
//
//@Entity
//@Table(name = "role")
//public class Role {
//
//    public Role(){}
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @Column(name="name")
//    private String name;
//
//    @ManyToMany(mappedBy = "roles")
//    private Set<User> users;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Set<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(Set<User> users) {
//        this.users = users;
//    }
//}
