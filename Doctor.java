package org.hosbitial.doctorsystem.doctorentity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="Doctor_table")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id1;
    @Column(name="Doctor_name",nullable = false)
    private String name;
    @Column(name="address",nullable = false)
    private String address;
    @Column(name="doctor_phone",nullable = false,unique = true)
    private String phone;
    @Column(name = "doctor_gender",nullable = false)
    private String gender;
    @Column(name = "doctor_email",nullable = false,unique = true)
    private  String email;
    @Column(name="doctor_specialization",nullable = false)
    private String specialization;




}
