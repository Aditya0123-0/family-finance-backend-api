package com.example.familyfinance.controller;

import com.example.familyfinance.entity.Document;
import com.example.familyfinance.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documents")
public class DocumentController {
    @Autowired
    private DocumentService documentService;

    @PostMapping
    public Document createDocument(@RequestBody Document document){
        return documentService.createDocument(document);
    }
    @GetMapping("/{documentId}")
    public Document getDocumentById(@PathVariable Long documentId){
        return documentService.getDocumentById(documentId);
    }
    @GetMapping
    public List<Document> getAllDocument(){
        return documentService.getAllDocument();
    }
    @PutMapping("/{documentId}")
    public Document updtaeDocument(@PathVariable Long documentId, @RequestBody Document document){
        return documentService.updtaeDocument(documentId,document);
    }
    @DeleteMapping("/{documentId}")
    void deleteDocument(@PathVariable Long documentId){
        documentService.deleteDocument(documentId);
    }
}
