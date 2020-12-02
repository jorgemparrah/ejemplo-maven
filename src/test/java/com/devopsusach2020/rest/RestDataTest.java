package com.devopsusach2020.rest;

import com.devopsusach2020.model.Pais;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RestDataTest {

    @Test
	void getDataWithMessage() {
        RestData target = new RestData();
        String message = "Prueba de Ejemplo";
        Pais output = target.getData(message);
        Assertions.assertNotNull(output);
        Assertions.assertNotNull(output.getMensaje());
        Assertions.assertTrue(output.getMensaje().equals("Mensaje Recibido: " + message));
    }

    @Test
	void getDataWithMessageEmpty() {
        RestData target = new RestData();
        String message = "";
        Pais output = target.getData(message);
        Assertions.assertNotNull(output);
        Assertions.assertNotNull(output.getMensaje());
        Assertions.assertTrue(output.getMensaje().equals("Mensaje Recibido: "));
    }

    @Test
	void getDataWithMessageNull() {
        RestData target = new RestData();
        Pais output = target.getData(null);
        Assertions.assertNotNull(output);
        Assertions.assertNotNull(output.getMensaje());
        Assertions.assertTrue(output.getMensaje().equals("Mensaje Recibido: null"));
    }

    @Test
	void getTotalPaisWithMessageNull() {
        RestData target = new RestData();
        Pais output = target.getTotalPais(null);
        Assertions.assertNotNull(output);
        Assertions.assertNull(output.getCountry());
    }

}
