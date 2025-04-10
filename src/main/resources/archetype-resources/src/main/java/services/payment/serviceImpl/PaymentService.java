package ${package}.services.payment.serviceImpl;

import ${package}.services.payment.dto.PaymentDto;
import ${package}.services.payment.interfaces.IPaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentService implements IPaymentService {
    @Override
    public PaymentDto successPayment(String message) {
        return new PaymentDto(message);
    }
}
