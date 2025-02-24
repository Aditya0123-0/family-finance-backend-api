package com.example.familyfinance.controller;

import com.example.familyfinance.entity.Asset;
import com.example.familyfinance.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assets")
public class AssetController {
    @Autowired
    private AssetService assetService;

    @PostMapping
    public Asset createAsset(@RequestBody Asset asset){
        return  assetService.createAsset(asset);
    }

    @GetMapping("/{assetId}")
   public Asset getAssetById(@PathVariable Long assetId){
        return assetService.getAssetById(assetId);
    }

    @GetMapping
    public List<Asset> getAllAsset(){
        return  assetService.getAllAsset();
    }

    @PutMapping
    public Asset updateAsset(@PathVariable Long assetId, @RequestBody Asset asset){
        return  assetService.updateAsset(assetId,asset);
    }

    @DeleteMapping("/{assetId}")
    public void deleteAsset(@PathVariable Long assetId){
        assetService.deleteAsset(assetId);
    }
}
