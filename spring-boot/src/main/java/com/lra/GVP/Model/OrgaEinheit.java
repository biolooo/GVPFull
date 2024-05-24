package com.lra.GVP.Model;

import com.lra.GVP.Helper.ArtOrgaEinheit;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class OrgaEinheit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @ManyToOne
    private OrgaEinheit ueberGeordnet;

    @Enumerated(EnumType.STRING)
    private ArtOrgaEinheit artOrgaEinheit;

    public OrgaEinheit(String name, OrgaEinheit ueberGeordnet, ArtOrgaEinheit artOrgaEinheit) {
        this.name = name;
        this.ueberGeordnet = ueberGeordnet;
        this.artOrgaEinheit = artOrgaEinheit;
    }

}
