package com.oumnia.tp3;

import com.oumnia.tp3.entities.Patient;
import com.oumnia.tp3.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Tp3Application implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(Tp3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /////////////Const sana Param////////////////
        //Patient	patient=new Patient();
        //		patient.setId(null);
        //		patient.setNom("Mohamed");
        //		patient.setDateNaissance(new Date());
        //	    patient.setMalade(false);
        ////	patient.setScore(23);
        ////
        //////////////Const Param///////////////
        //		Patient patient2= new Patient(null,"Yassine",new Date(),false,123);
        ////////////////Builder////////////////
        ////		//Utilisation du Builder
        ////		Patient patient3= Patient.builder()
        ////				.nom("Imane")
        ////				.dateNaissance(new Date())
        ////				.score(56)
        ////				.malade(true)
        ////				.build();
        patientRepository.save(new Patient(null,"Patient1",new Date(),false,1));
        patientRepository.save(new Patient(null,"Patient2",new Date(),false,2));
        patientRepository.save(new Patient(null,"Patient3",new Date(),false,3));
    }
}
