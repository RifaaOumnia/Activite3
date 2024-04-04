package com.oumnia.tp3.repository;

import com.oumnia.tp3.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    //Convention
    Page<Patient>findByNomContains(String keyword, Pageable pageable);

    //@Query("select p from Patient p where p.nom like :x")
    //Page<Patient> chercher(@Param("x")String keyword,Pageable pageable);
}
