package com.example.myapplicatio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telecom.Call;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplicatio2.Service.PatientApi;
import com.example.myapplicatio2.Service.RetrofitService;
import com.example.myapplicatio2.model.Patient;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainActivity<patient_name, patient_second_name, patient_last_name, address, phone_number, age, gender, gender2, submit> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 initializer();
    }

    public void initializer(){
        EditText patient_name,patient_second_name,patient_last_name,address,phone_number,age,gender,gender2;
        Button submit;
    }
    patient_name=findViewById(R.Id.patient_name);
    patient_second_name=findViewById(R.Id.patient_second_name);
    patient_last_name=findViewById(R.Id.patient_last_name);
    address=findViewById(R.Id.address);
    phone_number=findViewById(R.Id.phone_number);
    age=findViewById(R.Id.age);
    gender=findViewById(R.Id.gender);
    gender2=findViewById(R.Id.gender2);
    submit=(Button) findViewById(R.Id.submit);

    RetrofitService retrofitService =new RetrofitService();
    PatientApi patientApi = retrofitService.getRetrofit().create(PatientApi.class);
    submit.setOnClickListener(view->{
        String patient_name=String.valueOf(patient_name.getText());
        String patient_second_name=String.valueOf(patient_second_name.getText());
        String patient_last_name=String.valueOf(patient_last_name.getText());
        String address=String.valueOf(address.getText());
        Integer phone_number=Integer.valueOf(phone_number.getText());
        Integer age=Integer.valueOf(age.getText());
        String gender=String.valueOf(gender.getText());
        String gender2=String.valueOf(gender2.getText());
        Patient patient=new Patient();

        patient.setPatient_name(patient_name);
        patient.setPatient_second_name(patient_second_name);
        patient.setPatient_last_name(patient_last_name);
        patient.setAddress(address);
        patient.setPhone_number(phone_number);
        patient.setAge(age);
        patient.setGender(gender);


        patientApi.save(patient)
                .enqueue(new Window.Callback<Patient>(){
                    @Override
                    public void onResponse(Call<Patient>call, Response<Patient>response){
                        Toast.makeText(MainActivity.this, "Save successful", Toast.LENGTH_SHORT).show();
                    }
                    @Override
                    public void onFailure(Call<Patient>call, Throwable t) {
                        Toast.makeText(MainActivity.this, "Save failed", Toast.LENGTH_SHORT).show();
                        Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, "error occured");
                    }
                })
    })
}
