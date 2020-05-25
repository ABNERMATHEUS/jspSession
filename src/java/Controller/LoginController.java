/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author abner
 */
public class LoginController extends HttpServlet {

      @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario = request.getParameter("tUsuario");
        String senha = request.getParameter("tSenha");
        
        HttpSession session = request.getSession();
        
        if(usuario.equals("admin") && senha.equals("123")){
            
            String nome = "Abner Matheus";
            session.setAttribute("Usuario", nome);
            
            request.getRequestDispatcher("Page/dashboard.jsp").forward(request,response);
         }else{
            session.invalidate();
            System.out.print("aa");
             request.getRequestDispatcher("index.jsp").forward(request,response);
        }
        
    }
}
