/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business;

import java.util.ArrayList;

/**
 *
 * @author mandalore
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> UserAccountList;

    public UserAccountDirectory() {
        this.UserAccountList = new ArrayList<UserAccount>();
    }
//
//    public UserAccountDirectory(ArrayList<UserAccount> UserAccountList) {
//        this.UserAccountList = new ArrayList<UserAccount>();
//    }

    public ArrayList<UserAccount> getUserAccountList() {
        return UserAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> UserAccountList) {
        this.UserAccountList = UserAccountList;
    }

    public UserAccount createUserAccount(String username, String password, String role) {

        UserAccount user = new UserAccount(username, password, role);
        UserAccountList.add(user);
        return user;
    }

    public UserAccount findById(String id) {
        for (UserAccount u : this.UserAccountList) {
            if (u.getAccountId().equals(id)) {
                return u;
            }
        }
        return null;
    }

    public UserAccount getUserAccount(String username, String password, String role) {
        for (UserAccount u : this.UserAccountList) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return u;
            }
        }
        return null;
    }

    public Boolean accountExists(String username, String password, String role) {
        for (UserAccount u : this.UserAccountList) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return true;
            }
        }
        return false;
    }

}
