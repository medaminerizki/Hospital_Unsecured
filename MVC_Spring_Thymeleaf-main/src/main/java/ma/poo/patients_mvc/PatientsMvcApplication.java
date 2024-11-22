package ma.poo.patients_mvc;

import ma.poo.patients_mvc.entities.Patient;
import ma.poo.patients_mvc.repositories.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication implements CommandLineRunner {
    @Autowired
    PatientRepo patientRepo;


    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepo.save(new Patient(null, "Hassan", new Date(), false, 12));
        patientRepo.save(new Patient(null, "Fatima", new Date(), true, 25));
        patientRepo.save(new Patient(null, "Ahmed", new Date(), false, 30));
        patientRepo.save(new Patient(null, "Sara", new Date(), true, 28));
        patientRepo.save(new Patient(null, "Mohammed", new Date(), true, 45));
        patientRepo.save(new Patient(null, "Zineb", new Date(), false, 22));
        patientRepo.save(new Patient(null, "Omar", new Date(), true, 35));
        patientRepo.save(new Patient(null, "Salma", new Date(), false, 18));
        patientRepo.save(new Patient(null, "Karim", new Date(), true, 40));
        patientRepo.save(new Patient(null, "Rania", new Date(), false, 33));
        patientRepo.save(new Patient(null, "Yassine", new Date(), true, 29));
        patientRepo.save(new Patient(null, "Nadia", new Date(), false, 21));
        patientRepo.save(new Patient(null, "Khalid", new Date(), true, 50));
        patientRepo.save(new Patient(null, "Amal", new Date(), false, 27));
        patientRepo.save(new Patient(null, "Reda", new Date(), true, 38));
        patientRepo.save(new Patient(null, "Imane", new Date(), false, 23));
        patientRepo.save(new Patient(null, "Anas", new Date(), true, 31));
        patientRepo.save(new Patient(null, "Soukaina", new Date(), false, 20));
        patientRepo.save(new Patient(null, "Ayman", new Date(), true, 42));
        patientRepo.save(new Patient(null, "Lina", new Date(), false, 19));
        patientRepo.save(new Patient(null, "Youssef", new Date(), true, 36));
        patientRepo.findAll().forEach(patient -> {
            System.out.println(patient.getName());
        });
    }
}
