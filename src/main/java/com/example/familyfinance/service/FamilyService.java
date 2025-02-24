package com.example.familyfinance.service;

import com.example.familyfinance.entity.Family;

import java.util.List;

public interface FamilyService {
    Family createFamily(Family family);
    Family getFamilyById(Long familyId);
    List<Family> getAllFamilies();
    Family updateFamily(Long familyId, Family family);
    void deleteFamily(Long familyId);
}
