package com.abouna.mparametre.services;

import com.abouna.mparametre.entites.AnneeAcademique;
import com.abouna.mparametre.repositories.AnneeAcademiqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnneeAcademiqueBusinessService {
    @Autowired
    private AnneeAcademiqueRepository anneeAcademiqueRepository;

    public AnneeAcademique save(AnneeAcademique annee){
        return anneeAcademiqueRepository.save(annee);
    }

    public List<AnneeAcademique> findAll(){
        return anneeAcademiqueRepository.findAll();
    }
}
