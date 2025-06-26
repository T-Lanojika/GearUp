package com.gearup.service;

import com.gearup.domain.PaymentMethod;
import com.gearup.model.PaymentOrder;
import com.gearup.payload.response.PaymentLinkResponse;
import com.gearup.payload.response.dto.BookingDTO;
import com.gearup.payload.response.dto.UserDTO;
import com.razorpay.PaymentLink;

public interface PaymentService {

    PaymentLinkResponse createOrder(UserDTO user,
                                    BookingDTO booking,
                                    PaymentMethod paymentMethod);

    PaymentOrder getPaymentOrderById(Long id);

    PaymentOrder getPaymentOrderByPaymentId(String paymentId);

    PaymentLink createRazorpayPaymentLink(UserDTO user,
                                          Long amount,
                                          Long orderId);

    String createStringPaymentLink(UserDTO user,
                                          Long amount,
                                          Long orderId);


}
