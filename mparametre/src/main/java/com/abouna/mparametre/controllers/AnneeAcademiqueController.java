package com.abouna.mparametre.controllers;

import com.abouna.mparametre.entites.AnneeAcademique;
import com.abouna.mparametre.services.AnneeAcademiqueBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/annee_academiques")
public class AnneeAcademiqueController {
    @Autowired
    private AnneeAcademiqueBusinessService anneeAcademiqueBusinessService;

    @GetMapping
    public List<AnneeAcademique> findAll(){
        return anneeAcademiqueBusinessService.findAll();
    }

    @PostMapping
    public AnneeAcademique save(@RequestBody AnneeAcademique anneeAcademique){
        return anneeAcademiqueBusinessService.save(anneeAcademique);
    }
}
