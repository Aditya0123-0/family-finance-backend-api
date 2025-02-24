package com.example.familyfinance.service.impl;

import com.example.familyfinance.entity.Document;
import com.example.familyfinance.repository.DocumentRepository;
import com.example.familyfinance.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    private DocumentRepository documentRepository;

    @Override
    public Document createDocument(Document document) {
        return documentRepository.save(document);
    }

    @Override
    public Document getDocumentById(Long documentId) {
        return documentRepository.findById(documentId).orElse(null);
    }

    @Override
    public List<Document> getAllDocument() {
        return documentRepository.findAll();
    }

    @Override
    public Document updtaeDocument(Long documentId, Document document) {
        if(documentRepository.existsById(documentId)){
            document.setDocumentId(documentId);
            return documentRepository.save(document);
        }
        return null;
    }

    @Override
    public void deleteDocument(Long documentId) {
        documentRepository.deleteById(documentId);

    }
}
