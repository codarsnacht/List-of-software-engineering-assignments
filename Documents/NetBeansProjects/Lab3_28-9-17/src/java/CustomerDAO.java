


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joseph
 */
class CustomerDAO {
    
    
    
    private static final String DATABASE_URL = "jdbc:mysql://mysql1.it.nuigalway.ie:3306/mydb3339";
    private static final String USERNAME = "mydb3339gj";
    private static final String PASSWORD = "bo2jaj";
    
    
    public void addNew(Customer c){
        Connection con = null;
        PreparedStatement prest = null;
        try{
            con = DriverManager.getConnection(DATABASE_URL , USERNAME , PASSWORD);
            prest = con.prepareStatement("INSERT INTO Customers(customerNumber, customerName, city, creditLimit) VALUES(?,?,?,?)");
            prest.setInt(1, c.getCustId());
            prest.setString(2, c.getName());
            prest.setString(3, c.getCity());
            prest.setDouble(4,  c.getCreditLimit());
            prest.execute();
            
            
        }
        catch(SQLException ex){
        
    }
       finally{
            try{
                
                if(prest != null){
                    prest.close();
                }
                if(con != null){
                    con.close();
                }
            }catch(SQLException ex){
                Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null , ex);
                
                
            }
        }
    }
    
    public Customer getCustomer(int id){
        Customer Customers = null;
        Connection con =null;
        Statement stt =null;
        try{
            
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            stt = con.createStatement();
            ResultSet rs = stt.executeQuery("SELECT * FROM customers WHERE customerNumber=" + id);
            if (rs.next()){
                Customers = new Customer();
                Customers.setCustId(rs.getInt(1));
                Customers.setName(rs.getString(2));
                Customers.setCity(rs.getString(8));
                Customers.setCreditLimit((int) rs.getDouble(13));
                
            }
        } catch(SQLException ex){
            
        }
        finally{
            try{
                
                if(stt != null){
                    stt.close();
                }
                if(con != null){
                    con.close();
                }
            }catch(SQLException ex){
                Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null , ex);
                
                
            }
        }
        return Customers;
    }
    
    
    
    public List<Customer> getCustomers() {
      
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex)
        {
             Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null , ex);
        }

        List<Customer> list = new ArrayList();
        Connection con = null;
        Statement stt = null;
        try{
             con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
             if (con == null)
{
    System.out.println ("connection is null!");
}
else
{
    System.out.println ("connection is ok");
}

            stt = con.createStatement();
            ResultSet rs = stt.executeQuery("SELECT * FROM customers");
            while(rs.next()){
                Customer Customers = new Customer();
                Customers.setCustId(rs.getInt(1));
                Customers.setName(rs.getString(2));
              
                Customers.setCity(rs.getString(8));
               Customers.setCreditLimit((int) rs.getDouble(13));
               
               
             list.add(Customers);
            }
        }catch(SQLException ex){
            System.out.println("testing2 exception");
        }finally{
            try{
                
                if(stt != null){
                    stt.close();
                }
                if(con != null){
                    con.close();
                }
            }catch(SQLException ex){
                Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null , ex);
                
                
            }
            //testing
            System.out.println("size = " + list.size());
        }
        return list;
    }

    
    
    
    
    
    
    
    List<Customer> getDetailedCustomers() {
       
      
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex)
        {
             Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null , ex);
        }

        List<Customer> list = new ArrayList();
        Connection con = null;
        Statement stt = null;
        try{
             con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
             if (con == null)
{
    System.out.println ("connection is null!");
}
else
{
    System.out.println ("connection is ok");
}

            stt = con.createStatement();
            ResultSet rs = stt.executeQuery("SELECT * FROM customers");
            while(rs.next()){
                Customer Customers = new Customer();
                Customers.setCustId(rs.getInt(1));
                Customers.setName(rs.getString(2));
                Customers.setFname(rs.getString(3));
                Customers.setLname(rs.getString(4));
                Customers.setPhone(rs.getString(5));
                Customers.setAddress1(rs.getString(6));
                Customers.setAddress2(rs.getString(7));
                Customers.setCity(rs.getString(8));
                Customers.setState(rs.getString(9));
               Customers.setCreditLimit((int) rs.getDouble(13));
              
               
             list.add(Customers);
            }
        }catch(SQLException ex){
            System.out.println("testing2 exception");
        }finally{
            try{
                
                if(stt != null){
                    stt.close();
                }
                if(con != null){
                    con.close();
                }
            }catch(SQLException ex){
                Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null , ex);
                
                
            }
            //testing
            System.out.println("size = " + list.size());
        }
        return list;
    }
    
    
    
    
   }
