package com.raul051.payments;

public interface PaymentGatway {

   PaymemtResponse requestPayment(PaymentRequest request);
}
