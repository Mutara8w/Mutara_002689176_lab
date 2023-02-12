/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business;

import UI.AgentWorkArea.AgentJFrame;
import UI.CustomerWorkArea.CustomerJFrame;
import UI.MangerWorkArea.MangerJFrame;
import javax.swing.JFrame;

/**
 *
 * @author mandalore
 */
public class UserAccount {

    private static int count = 0;

    private String accountId;

    private String username;

    private String password;

    private String role;

    // constuctor 1
    public UserAccount() {
        this.accountId = "ACC " + count++;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // consturctor 2
    public UserAccount(String username, String password, String role) {
        this.accountId = role + count++;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int aCount) {
        count = aCount;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public JFrame getWorkArea(String role, Business business, UserAccount userAccount) {
        if (role.equals("manager")) {
            return new MangerJFrame(business, userAccount);
        }
        if (role.equals("customer")) {
            return new CustomerJFrame(business, userAccount);
        }
        if (role.equals("agent")) {
            return new AgentJFrame(business, userAccount);
        }
        return null;
    }

}
