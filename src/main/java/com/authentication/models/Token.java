package com.authentication.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity(name = "token")
public class Token extends BaseModel
{
    private String value;
    @ManyToOne
    private User user;
    private Date expiryAt;
}
