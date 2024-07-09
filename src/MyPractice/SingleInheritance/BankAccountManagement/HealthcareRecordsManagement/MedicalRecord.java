package MyPractice.SingleInheritance.BankAccountManagement.HealthcareRecordsManagement;

public class MedicalRecord {
    private String patientName;
    private String recordNumber;

    // constructor to initialize

    private MedicalRecord(String patientName, String recordNumber) {
        this.patientName = patientName;
        this.recordNumber = recordNumber;
    }
    public MedicalRecord(){
    }
    // Getters
    public String getPatientName() {return patientName;}
    public String getRecordNumber() {return recordNumber;}


}
     /*
        1. Create a base class called MedicalRecord.
            2. Define private member variables: patientName (type String) and recordNumber (type String).
            3. Provide a constructor to initialize these variables.
        4. Implement public methods getPatientName() and getRecordNumber() to access these variables.
            5. Create a derived class called VaccinationRecord that extends MedicalRecord.
            6. Add a private member variable: vaccineType (type String).
            7. Provide a constructor to initialize all variables.
        8. Implement public method getVaccineType() to access the vaccine type.
            9. In a main method, create a VaccinationRecord object and display all the details.
      */