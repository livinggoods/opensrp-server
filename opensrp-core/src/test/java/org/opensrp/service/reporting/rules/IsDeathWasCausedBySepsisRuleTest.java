package org.opensrp.service.reporting.rules;

import org.opensrp.util.SafeMap;
import org.junit.Before;
import org.junit.Test;
import org.opensrp.service.reporting.rules.IsDeathWasCausedBySepsisRule;

import static junit.framework.Assert.assertTrue;
import static org.opensrp.common.util.EasyMap.create;
import static org.junit.Assert.assertFalse;


public class IsDeathWasCausedBySepsisRuleTest {

    private IsDeathWasCausedBySepsisRule rule;

    @Before
    public void setUp() throws Exception {
        rule = new IsDeathWasCausedBySepsisRule();
    }

    @Test
    public void shouldReturnTrueIfDeathWasCausedBySepsis() {

        boolean didRuleApply = rule.apply(new SafeMap(create("deathCause", "sepsis").map()));

        assertTrue(didRuleApply);
    }

    @Test
    public void shouldReturnFalseIfDeathWasNotCausedBySepsis() {

        boolean didRuleApply = rule.apply(new SafeMap(create("deathCause", "within_24hrs").map()));

        assertFalse(didRuleApply);
    }
}
