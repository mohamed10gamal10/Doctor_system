package org.hosbitial.doctorsystem.doctorRepo;

import org.hosbitial.doctorsystem.doctorentity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Doctorrepo extends JpaRepository<Doctor,Long> {

}
