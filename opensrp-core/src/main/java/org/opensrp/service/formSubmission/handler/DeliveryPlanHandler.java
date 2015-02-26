package org.opensrp.service.formSubmission.handler;

import org.opensrp.form.domain.FormSubmission;
import org.opensrp.service.ANCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeliveryPlanHandler implements FormSubmissionHandler {
    private ANCService ancService;

    @Autowired
    public DeliveryPlanHandler(ANCService ancService) {
        this.ancService = ancService;
    }

    @Override
    public void handle(FormSubmission submission) {
        ancService.deliveryPlanned(submission);
    }
}
