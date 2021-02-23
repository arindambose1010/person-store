package com.person.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="ADDRESS")
@Getter @Setter @NoArgsConstructor
public class Address {

	@Column(name = "id")
	@Id
	@NotNull(message = "Id is Not Nullanle")
	Integer id;	 

	@NotBlank(message = "street can not be blank")
    @Column(name = "street")
    String street;

	@NotBlank(message = "city can not be blank")
    @Column(name = "city")
    String city;

    
	@NotBlank(message = "state can not be blank")
    @Column(name = "state")
    String state;

	@NotBlank(message = "postal code can not be blank")
    @Column(name = "postalCode")
    String postalCode;

    @NotNull(message = "personId is not Nullable")
    @JoinColumn
    @Column(name = "person_id")
    String personId;

	
    
}
