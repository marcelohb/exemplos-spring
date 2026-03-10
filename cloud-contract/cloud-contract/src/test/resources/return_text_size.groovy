import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return the text size"

    request {
        url "/text-size/?text=hello"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body(
                text : "hello",
                size : 5
        )
    }
}
