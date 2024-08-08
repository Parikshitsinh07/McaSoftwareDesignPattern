/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Admin
 */
public interface MyDatabase {
    public String getDriver();
    public String getDBurl();
    public String getUser();
    public String getPassword();
    public void setDriver(String Driver);
    public void setDBurl(String DBurl);
    public void setUser(String User);
    public void setPassword(String Password);
    public boolean getMyDatabeseConnection();
    public int execute(String Opretion,String Qurye);
    public void closeConnection();
}
