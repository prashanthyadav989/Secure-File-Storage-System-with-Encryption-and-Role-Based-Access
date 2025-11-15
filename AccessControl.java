
package com.project.security;

public class AccessControl {

    public static boolean canRead(User user){
        return user.getRole() == Role.ADMIN || user.getRole() == Role.USER || user.getRole() == Role.VIEWER;
    }

    public static boolean canWrite(User user){
        return user.getRole() == Role.ADMIN || user.getRole() == Role.USER;
    }

    public static boolean canDelete(User user){
        return user.getRole() == Role.ADMIN;
    }
}
