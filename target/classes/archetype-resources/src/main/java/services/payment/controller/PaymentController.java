package ${package}.services.payment.controller;

import lombok.RequiredArgsConstructor;
import ${package}.services.payment.dto.PaymentDto;
import ${package}.services.payment.interfaces.IPaymentService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payment")
public class PaymentController {

    private final IPaymentService paymentService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public PaymentDto paymentSuccess() {
        return paymentService.successPayment("Success payment");
    }
}