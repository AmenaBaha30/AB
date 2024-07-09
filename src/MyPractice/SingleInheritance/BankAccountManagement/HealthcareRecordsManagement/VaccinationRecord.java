package MyPractice.SingleInheritance.BankAccountManagement.HealthcareRecordsManagement;

public class VaccinationRecord extends MedicalRecord {
    private final String vaccineType;

    // constructor to initialize all variables

    public VaccinationRecord(String vaccineType) {
        this.vaccineType = vaccineType;
    }

    public VaccinationRecord(String ooo, String amena, String good, String vaccineType) {
        this.vaccineType = vaccineType;
    }

    public String getVaccineType(){
        return vaccineType;
    }


}