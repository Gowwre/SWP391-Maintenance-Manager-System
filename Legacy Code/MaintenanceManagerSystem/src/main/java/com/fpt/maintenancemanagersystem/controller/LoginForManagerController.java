/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.fpt.maintenancemanagersystem.controller;

import com.fpt.maintenancemanagersystem.dal.MaintenaceManagerDAO;
import com.fpt.maintenancemanagersystem.model.MaintenanceManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Radriar
 */
public class LoginForManagerController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        MaintenanceManager maintenanceManager = getManagerByCredentials(email, password);

        boolean isValidLogin = maintenanceManager != null;

        if (isValidLogin) {

            forwardToHomepage(request, response);
        } else {
            sendErrorMessage(request, response);
        }
    }

    private void forwardToHomepage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("managerHomePage.jsp").forward(request,response);
    }

    private void sendErrorMessage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("LOGIN_ERROR","Sai thông tin đăng nhập, vui lòng thử lại");
        request.getRequestDispatcher("maintenanceManagerLogin.jsp").forward(request,response);
    }

    private MaintenanceManager getManagerByCredentials(String email, String password) throws SQLException, ClassNotFoundException {
        MaintenaceManagerDAO maintenaceManagerDAO = new MaintenaceManagerDAO();
        MaintenanceManager manager = maintenaceManagerDAO.login(email, password);
        return manager;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
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
