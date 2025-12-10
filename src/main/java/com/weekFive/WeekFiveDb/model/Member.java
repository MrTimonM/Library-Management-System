package com.weekFive.WeekFiveDb.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // name required
    private String name;

    @Column(nullable = false, unique = true) // email unique & required
    private String email;

    private LocalDate membershipDate;

    public Member() {
    }

    public Member(String name, String email, LocalDate membershipDate) {
        this.name = name;
        this.email = email;
        this.membershipDate = membershipDate;
    }

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public LocalDate getMembershipDate() { return membershipDate; }

    public void setMembershipDate(LocalDate membershipDate) {
        this.membershipDate = membershipDate;
    }
}
