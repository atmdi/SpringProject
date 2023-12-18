package ir.java.up.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Person {
    @NotNull(message = "id not null")
    //@NotBlank
    @Min(value = 0)
    private Long id;
    private String name;
    private String lastname;
}
