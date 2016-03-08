package org.opensrp.scheduler;

import java.util.List;
import java.util.Map;

import org.motechproject.scheduletracking.api.domain.Enrollment;

public interface HookedEvent {
    void invoke(MilestoneEvent event, Map<String, String> extraData);
    void scheduleSaveToOpenMRSMilestone( Enrollment el,List<Action> alertActions );
    
}
