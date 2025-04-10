package ${package}.services.payment.dto;

#if ($with-lombok == true)
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
#end

#if ($with-lombok == true)
@Data
@NoArgsConstructor
@AllArgsConstructor
#end
public class PaymentDto {
    private String message;
    #if ($with-lombok == false)
    public PaymentDto(String message) {
        this.message = message;
    }
    #end
}