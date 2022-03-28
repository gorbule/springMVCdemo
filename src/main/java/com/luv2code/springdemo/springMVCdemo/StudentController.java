package com.luv2code.springdemo.springMVCdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    //create method to show form
    @RequestMapping("/showForm")
    public String showForm(Model theModel) {
        //create a new student object
        Student theStudent = new Student();

        //add student object to the model
        theModel.addAttribute("student", theStudent);

        return "studentForm";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {
        //log the input data
        System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());
        return "student-confirmation";

    }
}
