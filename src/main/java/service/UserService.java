package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DB.DBConnection;
import model.User;

public class UserService {
    Connection connection = DBConnection.getCon();
    public User getUserrById(String userId) {
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from user where id='"+ userId +"'");
            if(rs.next()) {
                User user = new User();
                user.setId(Integer.parseInt(rs.getString("id")));
                user.setFirstname(rs.getString("firstName"));
                user.setLastname(rs.getString("lastName"));
                user.setEmail(rs.getString("email"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));
                user.setCountryOfResidence(rs.getNString("countryOfResidence"));
                return user;
            }
        } catch (SQLException e) {
            System.out.println("Failed User Service");
            e.printStackTrace();
        }
        return null;

    }
}
