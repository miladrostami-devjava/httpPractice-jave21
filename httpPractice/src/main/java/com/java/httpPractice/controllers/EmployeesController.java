package com.java.httpPractice.controllers;

import com.java.httpPractice.domain.entities.EmployeeInformation;
import com.java.httpPractice.services.EmployeeInHospitalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/employees")
public class EmployeesController {

private final EmployeeInHospitalService inHospitalService;


    public EmployeesController(EmployeeInHospitalService inHospitalService) {
        this.inHospitalService = inHospitalService;
    }

    @GetMapping("/list")
    public String getEmployees(Model model){
        List<EmployeeInformation> employees = inHospitalService.getEmployees();
        model.addAttribute("employees",employees);
        model.addAttribute("employeesInformation",new EmployeeInformation());
return "employees";
    }

   /* @PostMapping("/create")
    public RedirectView createEmployee(@ModelAttribute EmployeeInformation employeeInformation){
        EmployeeInformation employeeInfo = inHospitalService.createEmployee(employeeInformation);
        return new RedirectView("/api/employees/list");
    }*/

  /*  @PostMapping("/create")
    public String createEmployee(@ModelAttribute EmployeeInformation employeeInformation){
        EmployeeInformation employeeInfo = inHospitalService.createEmployee(employeeInformation);
        return "redirect:/api/employees/list";
    }*/

 /*   @PostMapping("/create")
    public ModelAndView createEmployee(ModelMap modelMap ){
        EmployeeInformation employeeInfo = inHospitalService
                .createEmployee((EmployeeInformation) modelMap
                        .getAttribute("employeesInformation"));
        return new ModelAndView("redirect:/api/employees/list", (Map<String, ?>) employeeInfo);

    }*/




}
