package ${package}.services.payment.interfaces;

import ${package}.services.payment.dto.PaymentDto;

public interface IPaymentService {
    PaymentDto successPayment(String message);
}