

import enterprise.web_jpa_war.entity.MyOnlineWatchShop;
import enterprise.web_jpa_war.entity.MyOnlineWatchShopFacade;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * The servlet class to insert Product into database
 */
@WebServlet(name="CreateProductServlet", urlPatterns={"/CreateProduct"})
public class CreateProductServlet extends HttpServlet {

    @EJB
    private MyOnlineWatchShopFacade myOnlineWatchShopFacade;
  

        
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    
        String make = request.getParameter("make");
        String weight = request.getParameter("weight");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String price  = request.getParameter("price");
        String batteryLife = request.getParameter("batteryLife");
        
        
        
        
        
        MyOnlineWatchShop newProduct = new MyOnlineWatchShop ();
        newProduct.setMake(make);
        newProduct.setWeight(weight);
        newProduct.setPrice(price);
        newProduct.setBatteryLife(batteryLife);
        newProduct.setQuantity(quantity);
        
        
        myOnlineWatchShopFacade.create(newProduct);
        
        request.getRequestDispatcher("ListWatches").forward(request, response);
        
        
       
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
