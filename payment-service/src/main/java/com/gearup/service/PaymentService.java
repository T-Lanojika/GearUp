package com.gearup.service;

import com.gearup.domain.PaymentMethod;
import com.gearup.model.PaymentOrder;
import com.gearup.payload.response.PaymentLinkResponse;
import com.gearup.payload.response.dto.BookingDTO;
import com.gearup.payload.response.dto.UserDTO;
import com.razorpay.PaymentLink;
import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;

public interface PaymentService {

    PaymentLinkResponse createOrder(UserDTO user,
                                    BookingDTO booking,
                                    PaymentMethod paymentMethod) throws RazorpayException, StripeException;

    PaymentOrder getPaymentOrderById(Long id) throws Exception;

    PaymentOrder getPaymentOrderByPaymentId(String paymentId);

    PaymentLink createRazorpayPaymentLink(UserDTO user,
                                          Long amount,
                                          Long orderId) throws RazorpayException;

    String createStripePaymentLink(UserDTO user,
                                          Long amount,
                                          Long orderId) throws StripeException;

    Boolean proceedPayment(PaymentOrder paymentOrder,String paymentId,
                           String paymentLinkId) throws RazorpayException;

}
