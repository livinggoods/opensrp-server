package org.opensrp.register.mcare.report.mis1.familyPlanning;

import org.opensrp.register.mcare.domain.Members;
import org.opensrp.register.mcare.report.mis1.Report;
import org.opensrp.register.mcare.report.mis1.familyPlanning.birthControlMethdoUsagesCalculation.*;
import org.opensrp.register.mcare.report.mis1.familyPlanning.eligibleCoupleCount.EligibleCoupleCountCalculator;


public class FamilyPlanningReport extends Report {
    private EligibleCoupleCountCalculator eligibleCoupleCountCalculator;
    private PillMethodUsagesCalculator pillUsagesCalculator;
    private CondomMethodUsagesCalculator condomUsagesCalculator;
    private IUDUsagesCalculator iudUsagesCalculator;
    private ImplantUsagesCalculator implantUsagesCalculator;
    private MalePermanentMethodUsagesCalculator malePermanentMethodUsagesCalculator;
    private FemalePermanentMethodUsagesCalculator femalePermanentMethodUsagesCalculator;

    public FamilyPlanningReport(long startDateTime, long endDateTime) {
        super(startDateTime, endDateTime);
    }

    /**
     * Use base classes reflection method to init all internal calculators.
     *
     * @param startDateTime
     * @param endDateTime
     */
    @Override
    protected void initCalculators(long startDateTime, long endDateTime) {
        this.useReflectionToDynamicallyInitAllMemberOf(this.getClass(), startDateTime, endDateTime);
    }

    /**
     * Use base classes reflection method to call `calculate` method on all calculator.
     *
     * @param member
     */
    @Override
    public void calculate(Members member) {
        this.useReflectionToDynamicallyCallCalculateMethodOnAllMemberOf(this.getClass(), member);
    }

    public PillMethodUsagesCalculator getPillUsagesCalculator() {
        return pillUsagesCalculator;
    }

    public CondomMethodUsagesCalculator getCondomUsagesCalculator() {
        return condomUsagesCalculator;
    }

    public EligibleCoupleCountCalculator getEligibleCoupleCountCalculator() {
        return eligibleCoupleCountCalculator;
    }

}