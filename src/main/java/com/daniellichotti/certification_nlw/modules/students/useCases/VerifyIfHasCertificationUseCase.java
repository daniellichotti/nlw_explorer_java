package com.daniellichotti.certification_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.daniellichotti.certification_nlw.modules.students.dto.VerifyHasCertificationsDTO;

@Service
public class VerifyIfHasCertificationUseCase {
    
    public boolean execute(VerifyHasCertificationsDTO dto){
        if(dto.getEmail().equals("danielcoelho@gmail.com") && dto.getTechnology().equals("JAVA")){
            return true;
        }
        return false;
    }
}
