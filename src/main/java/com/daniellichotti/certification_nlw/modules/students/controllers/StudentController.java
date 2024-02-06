package com.daniellichotti.certification_nlw.modules.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniellichotti.certification_nlw.modules.students.dto.VerifyHasCertificationsDTO;
import com.daniellichotti.certification_nlw.modules.students.useCases.VerifyIfHasCertificationUseCase;

@RestController
@RequestMapping("/students")
public class StudentController {

    //usando o usecase
    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;
    
    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationsDTO verifyHasCertificationsDTO){
        //email
        //tec
        var result = this.verifyIfHasCertificationUseCase.execute(verifyHasCertificationsDTO);
        if(result){
            return "Usuario ja fez a prova";
        }

        return "Usuario pode fazer a prova";
    }
}
