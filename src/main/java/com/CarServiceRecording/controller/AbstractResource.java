package com.CarServiceRecording.controller;

import com.CarServiceRecording.domain.AbstractAuditingEntity;
import com.CarServiceRecording.domain.Services;
import com.CarServiceRecording.exceptions.BusinessException;
import com.CarServiceRecording.service.AbstractBusiness;

import java.util.List;

public class AbstractResource <T extends AbstractAuditingEntity> {

    protected AbstractBusiness<T> business;

    public List<T> getUserDocuments() {
        return business.findUserDocuments();
    }


    public List<T> getCars(long customerId){return business.getCars(customerId);}
    public List<T> getServices(long carId){return business.getServices(carId);}

    public T getDocument(Long documentId) {
        return business.getDocument(documentId);
    }

    public T addDocument(T document) throws BusinessException {
        business.saveDocument(document);
        return document;
    }
    public void updateDocument(long documentId, T document) throws BusinessException {
        document.setId(documentId);
        business.saveDocument(document);
    }

    public void deleteDocument(Long documentId) throws BusinessException {
        business.deleteDocument(documentId);
    }

    protected Services addServices(Services document,long id) throws BusinessException {
        business.saveServices(document,id);
        return document;
    }
}
