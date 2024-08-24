package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class axis_bank_entity {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String customer_name;
    private String address;
    private int phone_no;
    private double balance;
}
