package com.alina.main;

import java.sql.SQLException;
import java.util.List;

import com.alina.common.User;
import com.alina.common.UserService;

public class Main
{
    static UserService service = new UserService();
    
    public static void main(String[] args) throws SQLException
    {
        /*
         * User u1 = new User();
         * 
         * u1.setFirstName("Donna"); u1.setLastName("Madonna");
         * u1.setPassword("1111"); u1.setRole("admin");
         * 
         * User user = service.add(u1);
         * 
         * System.out.println(user);
         */
        
        List<User> users = service.getAll();
        
        for (User u : users)
        {
            System.out.println(u);
        }
    }
}