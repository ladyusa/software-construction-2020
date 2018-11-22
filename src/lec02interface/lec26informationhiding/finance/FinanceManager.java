package lec02interface.lec26informationhiding.finance;

import lec02interface.lec26informationhiding.common.Accountable;

public class FinanceManager {

    /**
     * Information Hiding
     *
     * interface Accountable helps hide sensitive information
     * in MedicalHistory objects in the parameter
     *
     * Therefore, this class FinanceManager CANNOT access
     * sensitive patient information such as symptom and diagnosis.
     * It can only access information related to its duty, which is
     * handling finance
     *
     * (Using interface to hide information is just one way
     * to do it. There are other ways to hide information
     * such as using encapsulation with private access modifiers.)
     *
     * @param treatment
     */
    public void calculatePayment(Accountable treatment) {

        // code to calculate payment for this doctor visit
        //  - it CANNOT access sensitive patient information
        // such as symptom and diagnosis, which is
        //    GOOD DESIGN

    }

}
