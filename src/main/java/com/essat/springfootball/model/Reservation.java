package com.essat.springfootball.model;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date_res;
    private int heure_debut;
    private int heure_fin;
    @ManyToOne
    private Adherant user;
    @ManyToOne
    @JoinColumn(name = "terrain_id")
    @JoinColumn(name = "terrain_id", nullable = false)
    private Terrain terrain;
	public Date getDate_res() {
		// TODO Auto-generated method stub
		return date_res;
	}
	public Terrain getTerrain() {
		// TODO Auto-generated method stub
		return terrain;
	}


}