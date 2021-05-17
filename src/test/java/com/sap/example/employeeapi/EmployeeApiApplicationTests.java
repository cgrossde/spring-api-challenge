package com.sap.example.employeeapi;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.json.JsonContent;

import java.util.UUID;

@SpringBootTest
@AutoConfigureJsonTesters
class EmployeeApiApplicationTests {

	private UUID uid = UUID.fromString("46a1b70c-b273-11eb-8529-0242ac130003");
	private String email = "walter@blue.diamonds";

	@Autowired
	private EmployeeController employeeController;

	@Autowired
	private JacksonTester<EmployeeEmailDTO> json;

	@Test
	void contextLoads() {
		assertThat(employeeController).isNotNull();
	}

	@Test
	public void testSerialization() throws Exception {
		EmployeeEmailDTO employeeEmailDto = new EmployeeEmailDTO(uid,email);

		JsonContent<EmployeeEmailDTO> result = this.json.write(employeeEmailDto);

		assertThat(result).hasJsonPathStringValue("$.id");
		assertThat(result).extractingJsonPathStringValue("$.id").isEqualTo(uid.toString());
		assertThat(result).hasJsonPathStringValue("$.email");
		assertThat(result).extractingJsonPathStringValue("$.email").isEqualTo(email);
	}

	@Test
	public void testDeserialization() throws Exception {
		String jsonContent = 	"{\"id\": \"" + uid + "\", " +
								"\"email\": \"" + email + "\"}";

		EmployeeEmailDTO result = this.json.parse(jsonContent).getObject();

		assertThat(result.getId().toString()).isEqualTo(uid.toString());
		assertThat(result.getEmail()).isEqualTo(email);
	}
}
