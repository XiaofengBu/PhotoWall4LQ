package com.hhu.model;

import javax.persistence.*;

/**
 * Created by buxiaofeng on 17/3/7.
 */
@Entity
@Table(name = "T_PICTURE" , schema = "lq")
public class Picture {
    private int picture_id;
    private String picture_path;
    private String picture_title;
    private String picture_desc;
    private String username;

    public Picture() {
    }
    public Picture(int picture_id, String picture_path, String picture_title, String picture_desc) {
        this.picture_id = picture_id;
        this.picture_path = picture_path;
        this.picture_title = picture_title;
        this.picture_desc = picture_desc;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PICTURE_ID" , nullable = false)
    public int getPicture_id() {
        return picture_id;
    }

    public void setPicture_id(int picture_id) {
        this.picture_id = picture_id;
    }

    @Column(name = "PICTURE_PATH" , nullable = false , length = 1023)
    public String getPicture_path() {
        return picture_path;
    }

    public void setPicture_path(String picture_path) {
        this.picture_path = picture_path;
    }

    @Column(name = "PICTURE_TITLE" , nullable = false , length = 255)
    public String getPicture_title() {
        return picture_title;
    }

    public void setPicture_title(String picture_title) {
        this.picture_title = picture_title;
    }

    @Column(name = "PICTURE_DESC" , nullable = false , length = 1023)
    public String getPicture_desc() {
        return picture_desc;
    }

    public void setPicture_desc(String picture_desc) {
        this.picture_desc = picture_desc;
    }

    @Column(name = "USERNAME" , nullable = false , length = 255)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
