package io.winty.pocs.pochashmapvsdto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDTO  {
    String resultado;
    String codigo;
    
    public ResponseDTO(RequestDTO request){
        this(request.getChave(), request.getTeste());
    }
}
