package br.com.makeshiftonjava.crosssellingservice.application;

import br.com.makeshiftonjava.crosssellingservice.model.CrossSelling;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cross-selling")
public class CrossSellingController {

    @RequestMapping(value = "/{productId}", method = RequestMethod.GET)
    public ResponseEntity<CrossSelling> retrieveCrossSeling(@PathVariable Long productId) {
        return ResponseEntity.ok(new CrossSelling(productId));
    }
}
