package org.hosbitial.doctorsystem.control;

import org.hosbitial.doctorsystem.Doctorserv.lmpi;
import org.hosbitial.doctorsystem.doctorentity.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Doctor")
public class Doctorcontrol {
    private final lmpi lmpi;

    public Doctorcontrol(lmpi Lmpi) {
        this.lmpi =Lmpi;
    }

    @GetMapping("/all")
    public List<Doctor> getAll() {
        return lmpi.getAlldoctor();
    }
    @PostMapping("/save")
    public Doctor addDoctor(@RequestBody Doctor doctor)
    {
        return lmpi.adddoctor(doctor);
    }
    @GetMapping("/{id}")
    public Doctor getdoctor(@PathVariable long id)
    {
        return lmpi.getdoctor(id);
    }

}
