package tarent.challenge.main.controllerTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import tarent.challenge.main.charGrouper.CharGrouper;
import tarent.challenge.main.controllers.CharGrouperController;
import tarent.challenge.main.sorter.ArraySorter;
import tarent.challenge.main.stringCompressor.StringCompressor;

//TODO: schmeißt connection refused exception
@RunWith(SpringRunner.class)
@WebMvcTest(CharGrouperController.class)
@ContextConfiguration(classes = { CharGrouper.class, ArraySorter.class, StringCompressor.class })
public class CharGrouperControllerTest {

	TestRestTemplate restTemplate = new TestRestTemplate();

	HttpHeaders headers = new HttpHeaders();

	@Test
	public void testAppService() throws Exception {
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		ResponseEntity<String> response = restTemplate.exchange("http://localhost:8080/chargrouper/abzuaaissna",
				HttpMethod.GET, entity, String.class);

		JSONAssert.assertEquals("a4binssuz", response.getBody(), false);

	}

}
