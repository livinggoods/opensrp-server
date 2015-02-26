package org.opensrp.service.reporting.rules;

import org.opensrp.util.SafeMap;
import org.springframework.stereotype.Component;

import static org.opensrp.common.AllConstants.FamilyPlanningFormFields.*;

@Component
public class CurrentFPMethodIsEitherMaleOrFemaleSterilizationRule implements IRule {

    @Override
    public boolean apply(SafeMap reportFields) {
        return FEMALE_STERILIZATION_FP_METHOD_VALUE.equalsIgnoreCase(reportFields.get(CURRENT_FP_METHOD_FIELD_NAME)) ||
                MALE_STERILIZATION_FP_METHOD_VALUE.equalsIgnoreCase(reportFields.get(CURRENT_FP_METHOD_FIELD_NAME));
    }
}

