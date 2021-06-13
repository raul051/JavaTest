package com.raul051.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class paymentProcesorTest {

    private PaymentGatway paymentGatway;
    private paymentProcesor paymentProcesor;

    @Before
    public void setup(){
        paymentGatway = Mockito.mock(PaymentGatway.class);
        paymentProcesor = new paymentProcesor(paymentGatway);
    }

    @Test
    public void payment_is_correct(){

        Mockito.when(paymentGatway.requestPayment(Mockito.any()))
                .thenReturn( new PaymemtResponse(PaymemtResponse.PaymentStatus.OK));


       assertTrue(paymentProcesor.makePayment(1000));
    }

    @Test
    public void payment_is_Incorrect(){

        Mockito.when(paymentGatway.requestPayment(Mockito.any())).thenReturn( new PaymemtResponse(PaymemtResponse.PaymentStatus.ERROR));



        assertFalse(paymentProcesor.makePayment(1000));
    }
}