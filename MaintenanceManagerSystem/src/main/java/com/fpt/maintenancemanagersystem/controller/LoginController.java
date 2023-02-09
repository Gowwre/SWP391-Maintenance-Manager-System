/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.fpt.maintenancemanagersystem.controller;

import com.fpt.maintenancemanagersystem.dal.MaintenanceStaffDAO;
import com.fpt.maintenancemanagersystem.model.MaintenanceStaff;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Radriar
 */
public class LoginController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        MaintenanceStaff staff = getStaffByCredentials(email, password);

        boolean isValidLogin = staff != null;
        try {
            if (isValidLogin){
                forwardToHomePage(request,response);
            }else {
                sendErrorMessage(request,response);
            }
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static MaintenanceStaff getStaffByCredentials(String email, String password) {
        MaintenanceStaffDAO staffDao = new MaintenanceStaffDAO();
        MaintenanceStaff staff = staffDao.login(email, password);
        return staff;
    }

    private void forwardToHomePage(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        request.getRequestDispatcher("homepage.jsp").forward(request,response);
    }

    private void sendErrorMessage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String errorMessage = "Sai thông tin đăng nhập, vui lòng thử lại";
        String loginPage = "maintenanceStaffLogin.jsp";

        request.setAttribute("LOGIN_ERROR",errorMessage);
        request.getRequestDispatcher(loginPage).forward(request,response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
