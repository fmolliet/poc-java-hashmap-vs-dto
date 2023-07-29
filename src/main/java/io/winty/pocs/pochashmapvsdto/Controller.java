package io.winty.pocs.pochashmapvsdto;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.jbosslog.JBossLog;

@JBossLog
@RestController
@RequestMapping("")
public class Controller {
    
    @PostMapping("/hashmap")
    public HashMap hashmap(@RequestBody HashMap<String, String> data){
        long start = System.nanoTime();
        data.put("resultado", data.get("chave"));
        data.put("codigo", data.get("teste"));
        long end = System.nanoTime();
        log.info("HASHMAP execution lasted:"+(end - start)+" ns");
        return data;
    }
    
    @PostMapping("/dto")
    public ResponseDTO dto(@RequestBody RequestDTO data){
        long start = System.nanoTime();
        ResponseDTO response = new ResponseDTO(data);
        long end = System.nanoTime();
        log.info("DTO execution lasted:"+(end - start)+" ns");
        return response;
    }
}
