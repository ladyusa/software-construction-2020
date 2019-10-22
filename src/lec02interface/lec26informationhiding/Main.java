package lec02interface.lec26informationhiding;

import lec02interface.lec26informationhiding.common.Doctor;
import lec02interface.lec26informationhiding.common.Patient;
import lec02interface.lec26informationhiding.finance.FinanceManager;
import lec02interface.lec26informationhiding.finance.FinanceManagerNOhiding;
import lec02interface.lec26informationhiding.medicalvisit.MedicalHistory;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Patient patient = new Patient("John","02-1234567","Bangkok","P1");
        Doctor doctor = new Doctor("Kate", "1", "General");
        MedicalHistory medicalHistory = new MedicalHistory(patient, doctor, new Date());

        // Finance manager may access sensitive health information
        FinanceManagerNOhiding bad = new FinanceManagerNOhiding();
        bad.calculatePayment(medicalHistory);

        // Safer. Finance manager can't get/set sensitive health information
        FinanceManager good = new FinanceManager();
        good.calculatePayment(medicalHistory);

    }
}
