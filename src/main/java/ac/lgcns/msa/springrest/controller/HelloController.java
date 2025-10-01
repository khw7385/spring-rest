package ac.lgcns.msa.springrest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<Map<String, Object>> hello(){

        ZonedDateTime now = ZonedDateTime.now();

        Map<String, Object> body =  new HashMap<>();
        body.put("koreaTime", now.toString());
        body.put("timestamp", now.toEpochSecond());
        body.put("message", "Hello World!");

        return ResponseEntity.ok(body);
    }
}
