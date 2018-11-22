package lec02interface.lec26informationhiding.common;

import lec02interface.lec26informationhiding.medicalvisit.MedicineOrder;

import java.util.Date;
import java.util.List;

/**
 * interface Accountable helps hide sensitive information
 * in MedicalHistory objects
 *
 * (Using interface to hide information is just one way
 * to do it. There are other ways to hide information
 * such as using encapsulation with private access modifiers.)
 *
 */
public interface Accountable {
    Patient getPatient();

    Doctor getDoctor();

    Date getVisitDate();

    List<MedicineOrder> getMedicineOrders();
}
