package org.opensrp.register.mcare.report.mis1.birthAndDeath;


import org.opensrp.connector.DHIS2.dxf2.DHIS2;
import org.opensrp.register.mcare.domain.Members;
import org.opensrp.register.mcare.report.mis1.ReportCalculator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BirthCountCalculator extends ReportCalculator {


    @DHIS2(dataElementId ="m1KL4jyNQMt",categoryOptionId="lB0hF1v7fbX",dataSetId="VvCMvqQWHa0")
    private long totalCountOfLiveBirth ;

    public BirthCountCalculator(long startDateTime, long endDateTime) {
        super(startDateTime, endDateTime);
        this.initCountVariables();

    }

    public long getTotalCountOfLiveBirth() {

        return totalCountOfLiveBirth;
    }

    public void initCountVariables() {

        this.totalCountOfLiveBirth = 0;
    }

    @Override
    public void calculate(Members member) {

        this.totalCountOfLiveBirth += addTotalLiveBirthChild(member);
    }

    private long addTotalLiveBirthChild(Members member) {
        Date dooDate = null;
        Date startDate = null;
        Date endDate = null;
        long value = 0;
        if( member.getCalc_Dob_Confirm() != null ){
            String deliveryDateStr =  member.getCalc_Dob_Confirm();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                dooDate = simpleDateFormat.parse(deliveryDateStr);
                startDate = new Date(startDateTime);
                endDate = new Date(endDateTime);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            if(dooDate.after(startDate) && dooDate.before(endDate) || dooDate.equals(startDate)){

                if(member.getMember_Birth_Date() != null){
                   value = 1;
                }
                else{
                    value = 0;
                }

            }

        }

        return value;
    }

}