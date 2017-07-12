package models;

import database.ConnectionFactory;
import java.sql.Connection;

public class Vehicle {
    Connection connection = ConnectionFactory.getConnection();

}
