package org.hosbitial.doctorsystem.Doctorserv;

import org.hosbitial.doctorsystem.doctorRepo.Doctorrepo;
import org.hosbitial.doctorsystem.doctorentity.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class lmpi  implements DoctorSErv{
    private final Doctorrepo doctorrepo;

    public lmpi(Doctorrepo doctorrepo) {
        this.doctorrepo = doctorrepo;
    }

    @Override
    public List<Doctor> getAlldoctor() {
        return doctorrepo.findAll();
    }

    @Override
    public Doctor getdoctor(Long id) {
        return doctorrepo.findById(id).orElse(null);
    }

    @Override
    public Doctor adddoctor(Doctor doctor) {
        return doctorrepo.save(doctor);
    }

    @Override
    public Doctor updateDoctor(long id, Doctor doctor) {
        return doctorrepo.findById(id).orElse(null);
    }

    @Override
    public void deletedoctor(long id) {
         doctorrepo.deleteById(id);
    }
}
