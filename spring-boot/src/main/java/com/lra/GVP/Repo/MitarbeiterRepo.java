package com.lra.GVP.Repo;

import com.lra.GVP.Model.Mitarbeiter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MitarbeiterRepo
        extends JpaRepository<Mitarbeiter, Long> {
}
