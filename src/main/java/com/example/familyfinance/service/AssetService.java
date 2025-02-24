package com.example.familyfinance.service;

import com.example.familyfinance.entity.Asset;

import java.util.List;

public interface AssetService {
    Asset createAsset(Asset asset);
    Asset getAssetById(Long assetId);
    List<Asset> getAllAsset();
    Asset updateAsset(Long assetId, Asset asset);
    void deleteAsset(Long assetId);
}


