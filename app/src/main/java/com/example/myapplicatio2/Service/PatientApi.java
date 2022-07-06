package com.example.myapplicatio2.Service;

import android.telecom.Call;

import com.example.myapplicatio2.model.Patient;

public interface PatientApi {
    @POST("/api/patient/")
    Call<Patient> save(@Body Patient patient);
}
