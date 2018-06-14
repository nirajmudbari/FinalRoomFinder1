package com.niraaz.finalroomfinder.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomUserDetails extends User implements UserDetails {

    public CustomUserDetails(User users) {
        super(users);
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    public Collection<? extends GrantedAuthority> getAuthorities( ) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

        for(Role role : getRoles()){
            System.out.println("UserProfile : "+role);
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getRole()));
        }
        System.out.print("authorities :"+authorities);
        return authorities;
    }

    public boolean isAccountNonExpired() {
        return true;
    }

    public boolean isAccountNonLocked() {
        return true;
    }

    public boolean isCredentialsNonExpired() {
        return true;
    }

    public boolean isEnabled() {
        return true;
    }
}
