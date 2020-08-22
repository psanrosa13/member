package com.devsjavagirl.member.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private LocalDate birthDate;
    private String state;
    private String city;
    private String email;
    private String login;
    private String password;
    private String phone;

    @OneToMany(cascade = CascadeType.ALL)
    private List<SocialNetwork> socialNetworks;

}
