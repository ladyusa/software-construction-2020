package lec02interface.lec26informationhiding.finance;

import lec02interface.lec26informationhiding.medicalvisit.MedicalHistory;

public class FinanceManagerNOhiding {

    /**
     * No Information Hiding. This class FinanceManager can access
     * sensitive patient information such as symptom and diagnosis.
     *
     * @param treatment
     */
    public void calculatePayment(MedicalHistory treatment) {

        // code to calculate payment for this doctor visit
        //  - it CAN access sensitive patient information
        // such as symptom and diagnosis, which is
        //    BAD DESIGN


    }

}
