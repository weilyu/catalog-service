package com.polarbookshop.catalogservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
class CatalogServiceApplicationTests {

    @Autowired
    private WebTestClient webTestClient;

//    @Test
//    void whenPostRequestThenBookCreated() {
//        var expectedBook = Book.of("1231231231", "Title", "Author", 9.90);
//
//        webTestClient
//                .post()
//                .uri("/books")
//                .bodyValue(expectedBook)
//                .exchange()
//                .expectStatus().isCreated()
//                .expectBody(Book.class).value(actualBook -> {
//                    assertThat(actualBook).isNotNull();
//                    assertThat(actualBook.isbn())
//                            .isEqualTo(expectedBook.isbn());
//                });
//    }
}