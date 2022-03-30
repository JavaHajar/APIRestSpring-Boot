package com.code.sbootwdc.model;

import javax.persistence.*;

@Entity
@Table(name = "admins")
@PrimaryKeyJoinColumn(name = "adminId")
public class Admin extends User{

}