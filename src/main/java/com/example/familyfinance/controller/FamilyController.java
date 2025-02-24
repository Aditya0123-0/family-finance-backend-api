package com.example.familyfinance.controller;

import com.example.familyfinance.entity.Family;
import com.example.familyfinance.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/families")
public class FamilyController {

    @Autowired
    private FamilyService familyService;

    @PostMapping
    public Family createFamily(@RequestBody Family family){
        return familyService.createFamily(family);
    }

    @GetMapping("/{familyId}")
    public  Family getFamilyById(@PathVariable Long familyId){
        return familyService.getFamilyById(familyId);
    }

    @GetMapping
    public List<Family> getAllFamilies(){
        return familyService.getAllFamilies();
    }

    @PutMapping("/{familyId}")
    public Family updateFamily(@PathVariable Long familyId, @RequestBody Family family){
        return  familyService.updateFamily(familyId,family);
    }

    @DeleteMapping("/{familyId}")
    public void deleteFamily(@PathVariable Long familyId){
        familyService.deleteFamily(familyId);
    }
}
