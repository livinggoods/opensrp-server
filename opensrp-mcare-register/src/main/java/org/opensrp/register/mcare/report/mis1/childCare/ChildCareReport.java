package org.opensrp.register.mcare.report.mis1.childCare;

import org.opensrp.register.mcare.domain.Members;
import org.opensrp.register.mcare.report.mis1.Report;

public class ChildCareReport extends Report {
    private NewBornCareReportCalculator newBornCareReportCalculator;
    private VaccinationReportCalculator vaccinationReportCalculator;
    private DiseaseReportCalculator diseaseReportCalculator;

    public ChildCareReport(long startDateTime, long endDateTime) {
        super(startDateTime, endDateTime);
    }


    public NewBornCareReportCalculator getNewBornCareReportCalculator() {
        return newBornCareReportCalculator;
    }

    @Override
    public void calculate(Members member) {
        useReflectionToDynamicallyCallCalculateMethodOnAllMemberOf(this.getClass(),member);
    }

    @Override
    public void initCalculators(long startDateTime, long endDateTime) {
        useReflectionToDynamicallyInitAllMemberOf(this.getClass(), startDateTime, endDateTime);
    }

    public VaccinationReportCalculator getVaccinationReportCalculator() {
        return vaccinationReportCalculator;
    }

    public DiseaseReportCalculator getDiseaseReportCalculator() {
        return diseaseReportCalculator;
    }
}
