package ${package}.services.payment.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import ${package}.services.payment.dto.PaymentDto;
import ${package}.services.payment.interfaces.IPaymentService;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@WebMvcTest(PaymentController.class)
public class PaymentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockitoBean
    private IPaymentService paymentService;

    PaymentDto paymentDto;

    @BeforeEach
    public void setUp() {
        paymentDto = new PaymentDto("message");
    }

    @Test
    public void test_payment_success_message() throws Exception {
        // Pre-condition
        when(paymentService.successPayment("Success payment")).thenReturn(paymentDto);

        ResultActions results = mockMvc.perform(MockMvcRequestBuilders.get("/payment"));

        results
            .andDo(print())
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.message", CoreMatchers.is("message")));
    }
}
