package br.com.makeshiftonjava.crosssellingservice.model;

public class CrossSelling {

    private Long productId;

    public CrossSelling(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
