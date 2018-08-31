package com.mypackage.repositories;

import com.mypackage.dbConnection.DbConnection;
import com.mypackage.models.Login;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.Map;

@Repository
public class LoginRepository {

    public Map checkLogin(Login login) {
        DbConnection dbConnection = new DbConnection();
        Connection connection = dbConnection.createConnection();
        Map hashMap = dbConnection.getUser(connection, login);
        return hashMap;

    }
}
