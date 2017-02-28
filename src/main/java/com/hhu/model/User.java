package com.hhu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by buxiaofeng on 17/2/28.
 */

@Entity
@Table(name = "T_USER" , schema = "lq")
public class User {
    private String username;
    private String chn_Name;
    private String password;

    public User(){

    }

    public User(String username, String chn_Name, String password) {
        this.username = username;
        this.chn_Name = chn_Name;
        this.password = password;
    }

    @Id
    @Column(name = "USERNAME" , nullable = false , length = 255)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "CHN_NAME" , nullable = false , length = 255)
    public String getChn_Name() {
        return chn_Name;
    }

    public void setChn_Name(String chn_Name) {
        this.chn_Name = chn_Name;
    }


    @Column(name = "PASSWORD" , nullable = false , length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
