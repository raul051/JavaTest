package com.raul051.payments;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class paymentProcesorTest {

    @Test
    public void payment_is_correct(){
        PaymentGatway paymentGatway = Mockito.mock(PaymentGatway.class);
        Mockito.when(paymentGatway.requestPayment(Mockito.any())).thenReturn( new PaymemtResponse(PaymemtResponse.PaymentStatus.OK));

        paymentProcesor paymentProcesor = new paymentProcesor(paymentGatway);

       assertTrue(paymentProcesor.makePayment(1000));
    }

    @Test
    public void payment_is_Incorrect(){
        PaymentGatway paymentGatway = Mockito.mock(PaymentGatway.class);
        Mockito.when(paymentGatway.requestPayment(Mockito.any())).thenReturn( new PaymemtResponse(PaymemtResponse.PaymentStatus.ERROR));

        paymentProcesor paymentProcesor = new paymentProcesor(paymentGatway);

        assertFalse(paymentProcesor.makePayment(1000));
    }
}