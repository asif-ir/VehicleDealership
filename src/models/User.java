package models;

import database.ConnectionFactory;
import java.sql.Connection;

public class User {
    Connection connection = ConnectionFactory.getConnection();
}
