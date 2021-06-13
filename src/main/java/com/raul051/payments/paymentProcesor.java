package com.raul051.payments;

public class paymentProcesor {

    private PaymentGatway paymentGatway;

    public paymentProcesor(PaymentGatway paymentGatway){
        this.paymentGatway = paymentGatway;
    }

    public boolean makePayment(double amount){

        PaymemtResponse response = paymentGatway.requestPayment(new PaymentRequest(amount));
        if (response.getStatus() == PaymemtResponse.PaymentStatus.OK){
            return true;
        }else{
            return false;
        }

    }
}
