package com.essat.springfootball.model;

import jakarta.persistence.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Terrain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String surface;
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	 @OneToMany(mappedBy = "terrain", cascade = CascadeType.ALL, orphanRemoval = true)
	    @JsonIgnore
	    private List<Reservation> reservations;

}
