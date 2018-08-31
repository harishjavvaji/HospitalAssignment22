package com.mypackage.services;

import com.mypackage.models.Doctor;
import com.mypackage.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    public void confirmAppointment(Doctor doctor, String userName) {

        appointmentRepository.confirmAppointment(doctor, userName);

    }

    public Map viewAppointments(String userName) {
        Map map = appointmentRepository.viewAppointments(userName);

        return map;
    }

    public void deleteAppointments(Doctor doctor, String userName) {
        appointmentRepository.deleteAppointment(doctor, userName);
    }
}
