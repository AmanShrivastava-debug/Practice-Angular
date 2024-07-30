package DatabaseRecall2;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PatientDAO {
    private Connection connection;
    private ResultSet resultSet;
    public PatientDAO(){
    try
    {
        connection=DatabaseConnection.getConnection();
    }
    catch(SQLException e)
    {
        e.printStackTrace();
    }}
    public void createPatient(Patient patient) {
        String sql="Insert into patientTable(patientName,medicalHistory)Values(?,?)";
        try(PreparedStatement statement=connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS))
        {
        statement.setString(1,patient.getPatientName());
        statement.setString(2,patient.getMedicalHistory());
        statement.executeUpdate();
        ResultSet resultset=statement.getGeneratedKeys();
        if(resultset.next())
        {
            patient.setPatientID(resultset.getInt(1));
        }
    }
    catch(SQLException e)
    {
        e.printStackTrace();
    }
        //Write a code for insert as well as reterive auto generate key assign to patientId
      
      
      //PatientDAO.java
}
public Patient getPatientByID(int patientID) throws RecordNotFoundException {
    String sql="Select * from patientTable where patientId=?";//Write the Code Here
    try(PreparedStatement statement=connection.prepareStatement(sql));
    {
        statement.setInt(1,patientID);
        ResultSet resultset=statement.executeQuery();
    }
    ResultSet resultset;
    if(resultset.next())
{
    
}}

public void close() {
//Write the Code Here
}

//PatientDAO.java
}