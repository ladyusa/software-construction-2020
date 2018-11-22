package lec02interface.lec26informationhiding.medicalvisit;

import lec02interface.lec26informationhiding.common.Accountable;
import lec02interface.lec26informationhiding.common.Doctor;
import lec02interface.lec26informationhiding.common.Patient;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class contains sensitive such as diagnosis and symptom
 *
 */
public class MedicalHistory implements Accountable {
    private Patient patient;
    private Doctor doctor;
    private Date visitDate;
    private String diagnosis;
    private String symptom;
    private List<MedicineOrder> medicineOrders;
    private List<LabResult> labResults;

    public MedicalHistory(Patient patient, Doctor doctor, Date visitDate) {
        this.patient = patient;
        this.doctor = doctor;
        this.visitDate = visitDate;
        this.medicineOrders = new ArrayList<>();
        this.labResults = new ArrayList<>();
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public void addMedicineOrder(MedicineOrder medicineOrder) {
        medicineOrders.add(medicineOrder);
    }

    public void addLabResults(LabResult labResult) {
        labResults.add(labResult);
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getSymptom() {
        return symptom;
    }

    public List<MedicineOrder> getMedicineOrders() {
        return medicineOrders;
    }

    public List<LabResult> getLabResults() {
        return labResults;
    }
}
