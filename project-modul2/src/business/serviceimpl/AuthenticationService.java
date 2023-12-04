package business.serviceimpl;

import business.entity.Admin;
import business.util.InputMethods;

import java.util.ArrayList;
import java.util.List;
import java.io.Console;
import java.util.Arrays;

public class AuthenticationService {
    private static List<Admin> admins = new ArrayList<>();

    static {
        // Initialize some admin users for testing
        admins.add(new Admin("admin", "admin"));
        admins.add(new Admin("admin2", "admin"));
    }

           public static boolean authenticateAdmin(String adminName,String password){
           for (Admin a : admins){
               if (a.getAdminName().equals(adminName)&&a.getPassword().equals(password)){
                   return true;
               }
           }
           return false;
       }
//    public static boolean authenticateAdmin(String adminName) {
//        Console console = System.console();
//        if (console == null) {
//            throw new RuntimeException("No console available");
//        }
//
//        char[] passwordChars = console.readPassword("Enter password: ");
//        String password = new String(passwordChars);
//
//        for (Admin a : admins) {
//            if (a.getAdminName().equals(adminName) && a.getPassword().equals(password)) {
//                // Clear the password from memory after use
//                Arrays.fill(passwordChars, ' ');
//                return true;
//            }
//        }
//
//        // Clear the password from memory if authentication fails
//        Arrays.fill(passwordChars, ' ');
//        return false;
//    }
}


