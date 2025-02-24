package com.example.familyfinance.service.impl;

import com.example.familyfinance.entity.Asset;
import com.example.familyfinance.repository.AssetRepository;
import com.example.familyfinance.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AssetServiceImpl implements AssetService {
    @Autowired
    private AssetRepository assetRepository;

    @Override
    public Asset createAsset(Asset asset) {
        return assetRepository.save(asset);
    }

    @Override
    public Asset getAssetById(Long familyId) {
        return assetRepository.findById(familyId).orElse(null);
    }

    @Override
    public List<Asset> getAllAsset() {
        return assetRepository.findAll();
    }

    @Override
    public Asset updateAsset(Long assetId, Asset asset) {
        if(assetRepository.existsById(assetId)){
            asset.setAssetId(assetId);
            return assetRepository.save(asset);
        }
        return null;
    }

    @Override
    public void deleteAsset(Long assetId) {
        assetRepository.deleteById(assetId);

    }
}
