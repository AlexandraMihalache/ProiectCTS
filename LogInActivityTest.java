package com.example.alexandra.medcommerce;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Alexandra on 5/27/2015.
 */
public class LogInActivityTest extends ActivityInstrumentationTestCase2<LogInActivity> {

    private LogInActivity logInActivity;
    private EditText nume,prenume,zi,luna,an,strada,numar,apartament, parola1, parola2;
    Button butonConectare;

    public LogInActivityTest() {
        super(LogInActivity.class);
    }

    @Override
    protected void setUp() throws Exception {    // imi setez variabilele pe care le voi folosi in majoritatea testelor
        super.setUp();
        logInActivity=getActivity();
        butonConectare=(Button)logInActivity.findViewById(R.id.buttonLogIn);
        nume=(EditText)logInActivity.findViewById(R.id.editTextNume);
        zi=(EditText)logInActivity.findViewById(R.id.editTextZiuaNasterii);
        luna=(EditText)logInActivity.findViewById(R.id.editTextLunaNasterii);
        an=(EditText)logInActivity.findViewById(R.id.editTextAnuNasterii);
    }

    //------------------------------------------Teste pentru verificarea initializarii variabilelor
    @SmallTest
    public void testActivitateInitialiata() throws Exception{
        assertNotNull("logInActivity are valoarea NULL (Variabila de tipul activitatii LogInActivity nu a fost initializata!)", logInActivity); //daca conditia e indeplinita testul trece altfel afiseaza mesaj
    }

    @SmallTest
    public void testButonConectareNeinitializat() throws Exception{
        assertNotNull("Butonul (butonConectare) nu a fost initializat!", butonConectare);
    }

    public void testEditTextNumeNeinitializat() throws Exception{
        assertNotNull("EditText-ul numelui (nume) nu a fost initializat!",nume );
    }

    public void testEditTextPrenumeNeinitializat() throws Exception{
        assertNotNull("EditText-ul prenumelui (prenume) nu a fost initializat!",prenume );
    }

    public void testEditTextZiNastereNeinitializat() throws Exception{
        assertNotNull("EditText-ul zilei de nastere (zi) nu a fost initializat!",zi );
    }

    public void testEditTextLunaNastereNeinitializat() throws Exception{
        assertNotNull("EditText-ul lunii de nastere (luna) nu a fost initializat!",luna );
    }

    public void testEditTextAnNastereNeinitializat() throws Exception{
        assertNotNull("EditText-ul anului de nastere (an) nu a fost initializat!",an );
    }

//---------------------------------------------------------------------------------
    @SmallTest
//    public void testParoleIdentice(){
//        parola1=(EditText)logInActivity.findViewById(R.id.editTextParola1);
//        parola2=(EditText)logInActivity.findViewById(R.id.editTextParola1);
//    }

//
//    public void testZiNormala(){
//
//
//    }


    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
