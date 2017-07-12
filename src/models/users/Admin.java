package models.users;

import database.ConnectionFactory;
import java.sql.Connection;

public class Admin {
    Connection connection = ConnectionFactory.getConnection();
}
