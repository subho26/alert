package com.example.alert;

import java.util.Date;
import java.util.UUID;
class AlertService {

    private final AlertDAO alertDAO;

    AlertService(final AlertDAO alertDAO){
        this.alertDAO = alertDAO;
    }

    public UUID raiseAlert() {
        return this.alertDAO.addAlert(new Date());
    }

    public Date getAlertTime(UUID id) {
        return this.alertDAO.getAlert(id);
    }
}
