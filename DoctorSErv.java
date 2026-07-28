package org.hosbitial.doctorsystem.Doctorserv;

import org.hosbitial.doctorsystem.doctorRepo.Doctorrepo;
import org.hosbitial.doctorsystem.doctorentity.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface DoctorSErv {
    List<Doctor>getAlldoctor();
    Doctor getdoctor(Long id);
    Doctor adddoctor(Doctor doctor);
    Doctor updateDoctor(long id,Doctor doctor);
    void deletedoctor(long id);

}
