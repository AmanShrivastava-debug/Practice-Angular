package DatabaseRecall2;

public class Main {
    public static void main(String[] args) {
        PatientDAO patientDAO = new PatientDAO();

        // Create a new patient record
        Patient patient1 = new Patient();
        patient1.setPatientName("John Doe");
        patient1.setMedicalHistory("High Sugar");
        patientDAO.createPatient(patient1);
        
        try{
            Patient retrievedPatient=PatientDAO.getPatientByID(patient1.getPatientID());
            System.out.println("Retrieved Patient: "+retrievedPatient.getPatientName());
            System.out.println("MedicalHistory: "+retrievedPatient.getMedicalHistory());
        }
        catch(RecordNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        patientDAO.close()
}