package com.minsx.core.common.entity.developer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.minsx.core.common.entity.base.simple.SimpleMinsxEntity;
import com.minsx.core.common.entity.base.type.DevUserState;
import com.minsx.core.common.entity.ordinary.User;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "minsx_dev_user")
public class DevUser extends SimpleMinsxEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "dev_user_id")
    private Integer id;

    @Length(min = 4, max = 32)
    @Column(nullable = false, name = "access_key", unique = true)
    private String accessKey;

    @NotBlank
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(nullable = false, name = "access_secret")
    private String accessSecret;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "state")
    private Integer state;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    @Column(name = "description")
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getAccessSecret() {
        return accessSecret;
    }

    public void setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DevUserState getState() {
        return DevUserState.getUserState(this.state);
    }

    public void setState(DevUserState devUserState) {
        this.state = devUserState.getValue();
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}