package uz.pdp.communicationsystem.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {
    private String simCardNumber;
    private String payType;
    private double amount;
    private String payerName;
    private String payerId;
}
