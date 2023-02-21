package com.fptu.maintenancemanagersystem.controller;

import com.fptu.maintenancemanagersystem.model.Manager;
import com.fptu.maintenancemanagersystem.model.Staff;
import com.fptu.maintenancemanagersystem.service.Manager.ManagerService;
import com.fptu.maintenancemanagersystem.service.Staff.StaffService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {
    @Autowired
    StaffService staffService;

    @Autowired
    ManagerService managerService;
    @GetMapping("/managerLogin")
    public String showManagerLoginForm(Model model){
        model.addAttribute("manager",new Manager());
        return "loginPages/maintenanceManagerLogin";
    }

    @GetMapping("/staffLogin")
    public String showStaffLoginForm(Model model){
        model.addAttribute("staff",new Staff());
        return "loginPages/maintenanceStaffLogin";
    }

   @PostMapping("/staffLogin")
    public String staffLogin(@ModelAttribute Staff staff, Model model, HttpSession session){
        Staff existedStaff = staffService.findUserByLogin(staff.getEmail(), staff.getPassword());
        if(existedStaff!=null){
            session.setAttribute("staff",existedStaff);
            return "homePages/maintenanceStaffHomePage";
        }
        else{
            String errorMessage = "Sai thông tin đăng nhập. Vui lòng thử lại.";
            model.addAttribute("errorMessage", errorMessage);
            return "loginPages/maintenanceStaffLogin";
    }}

    @PostMapping(value = {"/managerLogin"})
    public String managerLogin(@ModelAttribute("manager") Manager manager  ,HttpSession session, Model model){
        Manager existedManager = managerService.findUserByLogin(manager.getEmail(), manager.getPassword());
        if(existedManager != null){
            session.setAttribute("manager", existedManager);
            return "homePages/managerHomePage";
        }else{
            String errorMessage = "Sai thông tin đăng nhập. Vui lòng thử lại.";
            model.addAttribute("errorMessage", errorMessage);
            return "loginPages/maintenanceManagerLogin";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
}
