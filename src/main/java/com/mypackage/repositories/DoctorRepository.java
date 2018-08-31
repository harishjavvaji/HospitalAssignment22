package com.mypackage.repositories;

import com.mypackage.dbConnection.DbConnection;
import com.mypackage.models.Doctor;
import org.springframework.stereotype.Repository;

import java.sql.Connection;

@Repository
public class DoctorRepository {

    public void getDoctorsList(Doctor doctor) {

        DbConnection dbConnection = new DbConnection();
        Connection connection = dbConnection.createConnection();


    }
}
