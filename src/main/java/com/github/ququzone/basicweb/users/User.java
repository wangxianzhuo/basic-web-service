package com.github.ququzone.basicweb.users;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.Date;

/**
 * user model.
 *
 * @author Yang XuePing
 */
public class User implements Serializable {
    @Expose
    private String id;

    @Expose
    private String phone;

    private String password;

    private String salt;

    @Expose
    private String nickname;

    @Expose
    private String head;

    @Expose
    private Status status;

    @Expose
    private Date createdTime;

    @Expose
    private Date updatedTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public String toString() {
        return String.format("{id:%s, phone:%s, nickname:%s}", id, phone, nickname);
    }

    public enum Status {
        NORMAL, DISABLE
    }
}
