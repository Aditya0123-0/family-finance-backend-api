package com.example.familyfinance.service.impl;

import com.example.familyfinance.entity.Family;
import com.example.familyfinance.repository.FamilyRepository;
import com.example.familyfinance.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyServiceImpl implements FamilyService {
    @Autowired
    private FamilyRepository familyRepository;

    @Override
    public Family createFamily(Family family) {
        return familyRepository.save(family);
    }

    @Override
    public Family getFamilyById(Long familyId) {
        return familyRepository.findById(familyId).orElse(null);
    }

    @Override
    public List<Family> getAllFamilies() {
        return familyRepository.findAll();
    }

    @Override
    public Family updateFamily(Long familyId, Family family) {
        if(familyRepository.existsById(familyId)){
            family.setFamily_id(familyId);
            return familyRepository.save(family);
        }
        return null;
    }

    @Override
    public void deleteFamily(Long familyId) {
        familyRepository.deleteById(familyId);

    }
}
