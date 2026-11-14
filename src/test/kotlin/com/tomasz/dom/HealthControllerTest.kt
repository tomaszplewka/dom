package com.tomasz.dom

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

// @WebMvcTest starts only the web layer (controllers + JSON), not the whole app.
// Faster than @SpringBootTest, and no real server or port: MockMvc calls the controller in-process.
@WebMvcTest(HealthController::class)
class HealthControllerTest {

	@Autowired
	lateinit var mockMvc: MockMvc

	@Test
	fun `GET health returns status UP`() {
		mockMvc.get("/health").andExpect {
			status { isOk() }
      jsonPath("$.status") { value("UP") }
		}
	}
}
