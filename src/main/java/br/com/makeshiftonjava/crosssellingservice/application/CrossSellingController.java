package br.com.makeshiftonjava.crosssellingservice.application;

import br.com.makeshiftonjava.crosssellingservice.model.CrossSelling;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cross-selling")
public class CrossSellingController {

    private static final Logger LOG = LoggerFactory.getLogger(CrossSellingController.class);

    @RequestMapping(value = "/{productId}", method = RequestMethod.GET)
    public ResponseEntity<CrossSelling> retrieveCrossSeling(@PathVariable Long productId) {
        LOG.info("cross-selling/" + productId);
        return ResponseEntity.ok(new CrossSelling(productId));
    }
}
