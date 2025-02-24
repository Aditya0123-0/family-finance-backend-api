package com.example.familyfinance.service;

import com.example.familyfinance.entity.Document;

import java.util.List;

public interface DocumentService {
    Document createDocument(Document document);
    Document getDocumentById(Long documentId);
    List<Document> getAllDocument();
    Document updtaeDocument(Long documentId, Document document);
    void deleteDocument(Long documentId);
}
