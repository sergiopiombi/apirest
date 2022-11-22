package com.demo.api;

import com.demo.api.controller.UsuarioController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ApiApplicationTests {

	private UsuarioController usuarioController;
	@BeforeEach
	public void initTest() throws Exception{
		usuarioController = new UsuarioController();
	}

	@Test
	void testSaludar() throws Exception {

		Assertions.assertEquals("Hola",usuarioController.saludar());


	}



}
