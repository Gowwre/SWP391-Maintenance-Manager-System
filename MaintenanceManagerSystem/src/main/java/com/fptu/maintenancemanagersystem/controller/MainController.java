package com.fptu.maintenancemanagersystem.controller;

import com.fptu.maintenancemanagersystem.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MainController {


    @RequestMapping(value = {"/","/index"},method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = {"/viewAllRooms"},method = RequestMethod.GET)
    public String viewAllRooms(){
        return "viewRooms/viewAllRooms";
    }

    @RequestMapping(value = {"/report"},method = RequestMethod.GET)
    public String report(){
        return "reportForm/residentReportFaultDevice";
    }

    @RequestMapping(value = {"/managerLogin"},method = RequestMethod.GET)
    public String managerLogin(){
        return "loginPages/maintenanceManagerLogin";
    }

    @RequestMapping(value = {"/staffLogin"},method = RequestMethod.GET)
    public String staffLogin(){
        return "loginPages/maintenanceStaffLogin";
    }

    @RequestMapping(value = {"/forgotPassword"},method = RequestMethod.GET)
    public String forgotPassword(){
        return "passwordProblemPages/forgotPassword";
    }

    //Gains temporary access to staff homepage
    @RequestMapping(value = {"/staffHome"},method = RequestMethod.GET)
    public String staffHome(){
        return "homePages/maintenanceStaffHomePage";
    }

    //Gains temporary access to manager homepage
    @RequestMapping(value = {"/managerHome"},method = RequestMethod.GET)
    public String managerHome(){
        return "homePages/managerHomePage";
    }
    
    //Gain temporary access to create new password page
    @RequestMapping(value = {"/createNewPassword"},method = RequestMethod.GET)
    public String createNewPassword(){
        return "passwordProblemPages/createNewPassword";
    }

    //Gain temporary access to change password page
    @RequestMapping(value = {"/changePassword"},method = RequestMethod.GET)
    public String changePassword(){
        return "passwordProblemPages/changePassword";
    }
}
