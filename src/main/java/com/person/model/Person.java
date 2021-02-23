package com.person.model;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "PERSON")
public class Person {

	@NotNull(message = "Id name can not be Null")
    @Column(name = "id")
    @Id
    Integer id;

    @NotBlank(message = "First name can not be blank")
    @Column(name = "first_name")
    String fname;

    @NotBlank(message = "Last name can not be blank")
    @Column(name = "last_name")
    String lname;


}
