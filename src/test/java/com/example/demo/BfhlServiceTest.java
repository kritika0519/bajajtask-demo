package com.example.demo;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.demo.dto.RequestDto;
import com.example.demo.dto.ResponseDto;
import com.example.demo.service.BfhlServiceImpl;

public class BfhlServiceTest {

        @Test
        void testProcess() {

                BfhlServiceImpl service = new BfhlServiceImpl();

                RequestDto request = new RequestDto();

                request.setData(
                                List.of("a", "1", "334", "4", "R", "$"));

                ResponseDto response = service.process(request);

                assertEquals("kritika_aggarwal_19032005", response.getUserId());
                assertEquals("kritikaaggarwal19@gmail.com", response.getEmail());
                assertEquals("2310991878", response.getRollNumber());

                assertEquals("339", response.getSum());

                assertEquals(1,
                                response.getOddNumbers().size());

                assertEquals(2,
                                response.getEvenNumbers().size());

                assertEquals(2,
                                response.getAlphabets().size());

                assertEquals(1,
                                response.getSpecialCharacters().size());

                assertEquals("Ra",
                                response.getConcatString());
        }
}