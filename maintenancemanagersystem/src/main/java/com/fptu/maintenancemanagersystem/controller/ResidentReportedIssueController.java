package com.fptu.maintenancemanagersystem.controller;

import com.fptu.maintenancemanagersystem.model.ResidentReportedIssue;
import com.fptu.maintenancemanagersystem.service.ResidentReportedIssue.ResidentReportedIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ResidentReportedIssueController {
    @Autowired
    ResidentReportedIssueService residentReportedIssueService;

    @GetMapping("/createNewReport")
    public String showCreateNewReportForm(Model model) {
        model.addAttribute("residentReportedIssue", new ResidentReportedIssue());
        return "reportForm/residentReportFaultDevice";
    }

    @PostMapping("/createNewReport")
    public String createNewReport(@ModelAttribute("residentReportedIssue") ResidentReportedIssue residentReportedIssue) {
        residentReportedIssueService.createNewReport(residentReportedIssue);
        return "redirect:/";
    }
}
