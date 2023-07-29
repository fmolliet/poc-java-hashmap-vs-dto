package io.winty.pocs.pochashmapvsdto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class RequestDTO {
    @NotBlank String chave;
    @NotBlank String teste;
}
