package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {


    @DeleteMapping("transacao")
    public String deleta(@RequestParam int id)
    {
        return null;
    }

    @GetMapping("/usuario")
   public String retorna(@RequestParam int idUsuario)
   {
       return null;
   }

   @PostMapping("/usuario")
   public ResponseEntity<Object>posta(){
       return null;
   }



}
