package com.example.calculator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalcController{

    @GetMapping("/")
    public String home(){
        return "Holis mundo! Esta es la calculadora: ";
    }
    
    @GetMapping("/mul/{n1}/{n2}")
    public String mul(@PathVariable int n1, @PathVariable int n2){
        int resultado=n1*n2; //va a agarrar el valor 1 que le mandemos desde el enlace para hacer la suma
        return "Resultado: "+resultado;
    }

    //http://localhost:8080/suma-param?n1=5&n2=3

    @GetMapping("/suma-param")
    public String sumaParam(
            @RequestParam int n1,
            @RequestParam int n2
    ) {
        return "Resultado: " + (n1 + n2);
    }

}

