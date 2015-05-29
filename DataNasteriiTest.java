package com.example.alexandra.medcommerce;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.EditText;

/**
 * Created by Alexandra on 5/29/2015.
 */
public class DataNasteriiTest extends ActivityInstrumentationTestCase2<LogInActivity> {
    private LogInActivity logInActivity;
    private EditText zi,luna,an;
    private Client client;

    public DataNasteriiTest() {
            super(LogInActivity.class);
    }

    @Override
    protected void setUp() throws Exception {    // imi setez variabilele pe care le voi folosi in majoritatea testelor
        super.setUp();
        logInActivity=getActivity();
        zi=(EditText)logInActivity.findViewById(R.id.editTextZiuaNasterii);
        luna=(EditText)logInActivity.findViewById(R.id.editTextLunaNasterii);
        an=(EditText)logInActivity.findViewById(R.id.editTextAnuNasterii);
        //client cu valori normale pentru care trebuie sa ruleze toate testele
        client=new Client("Mihalache","Alexandra",4,6,1993,"B-dul......","100",100);

    }

    @SmallTest
    public void testZiValida() throws Exception{
        int zi=client.getZi(); //val 4
        assertTrue("Ziua este subunitara sau mai mare ca 31!", client.valideazaZi(zi)); //daca met intoarce false va arunca mesaj
    }


    @SmallTest
    public void testZiSubunitara() throws Exception{
        //int zi=client.getZi(); //val 4
        client.setZi(-5);
        int zi=client.getZi();
        assertFalse("Ziua este supraunitara!", client.valideazaZi(zi)); //daca met intoarce true va arunca mesaj
    }
    @SmallTest
    public void testZiMaiMareCa31() throws Exception{
        client.setZi(34);
        int zi=client.getZi();
        assertFalse("Ziua este subunitara!)", client.valideazaZi(zi)); //daca met intoarce true va arunca mesaj
    }


}
