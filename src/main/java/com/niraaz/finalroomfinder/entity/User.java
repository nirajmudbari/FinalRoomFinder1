package com.niraaz.finalroomfinder.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
@Table  // no need to mention table name by default it takes class name
public class User {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.AUTO)// it will generate unique Id automatically
    private int id;

    @NotEmpty
    @Column
    private String firstname;

    @NotEmpty
    @Column
    private String lastname;

    @NotEmpty
    @Column
    private String username;

    @NotEmpty
    @Column
    private String phone;

    @NotEmpty
    @Column
    private String email;

    @NotEmpty
    @Column
    private String password;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public User(User users) {
        this.id = users.getId();
        this.password = users.getPassword();
        this.email = users.getEmail();
        this.roles = users.getRoles();
        this.username = users.getUsername();
        this.firstname = users.getFirstname();
        this.lastname = users.getLastname();
        this.phone = users.getPhone();
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
