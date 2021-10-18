package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="MY_ENTITY")
public class MyEntity {

    @Id
    String myId;

    @Column(name="MY_NAME")
    String myName;

    @Column(name="CITY")
    String city;
}
