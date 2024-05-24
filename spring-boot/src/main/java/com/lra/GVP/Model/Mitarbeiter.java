package com.lra.GVP.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Mitarbeiter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private OrgaEinheit orgaEinheit;

    @ManyToOne
    private Mitarbeiter vertretung;

    private String vorname;
    private String nachname;

    private String telefonnummer;
    private String zimmer;
    private String aufgabe;


}
