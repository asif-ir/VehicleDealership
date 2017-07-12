package models.users;

import database.ConnectionFactory;
import java.sql.Connection;

public class Operator {
    Connection connection = ConnectionFactory.getConnection();
}
