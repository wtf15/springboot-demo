package com.example.demo;

import static org.junit.Assert.assertThat;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wtf
 * @date 2019/4/7 15:38
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {
    @LocalServerPort
    private int port;
    private URL baseUrl;
    @Autowired
    private TestRestTemplate template;

    @Before
    public void setUp() throws MalformedURLException {
        this.baseUrl = new URL("http://localhost:"+port);
    }

    @Test
    public void testHelloController(){
        ResponseEntity<String> responseEntity = template.getForEntity(baseUrl.toString()+"/hello",String.class);
        System.out.println(String.format("HelloController的测试结果为：%s",responseEntity.getBody()));
    }
}
