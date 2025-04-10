package ${package}.services.payment.serviceImpl;

import ${package}.services.payment.dto.PaymentDto;
import ${package}.services.payment.serviceImpl.PaymentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class PaymentServiceTests {

    @InjectMocks
    private PaymentService paymentService;

    private PaymentDto paymentDto;

    @BeforeEach
    public void setup() {
        paymentDto = new PaymentDto("message");
    }

    @Test
    public void test_payment_success_service() {
        // pre-condition

        // action
        PaymentDto response = paymentService.successPayment("message");
        assertEquals(response.getMessage(), "message");
    }
}
