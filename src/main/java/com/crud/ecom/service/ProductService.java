package com.crud.ecom.service;

import com.crud.ecom.Entity.Product;
import com.crud.ecom.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService
{
    @Autowired
    private ProductRepository repo;

    public List<Product> getAllProduct()
    {
        return repo.findAll();
    }
    public Product getProductById(Long id)
    {
       return repo.findById(id)
               .orElseThrow(()->
                       new RuntimeException("ID Not Found"));
    }
    public void deleteProduct(Long id)
    {
        repo.deleteById(id);
    }
    public Product addProducts(Product prduct)
    {
        return repo.save(prduct);
    }

    public Product updateProduct(Long id, Product product) {

        Product update = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        update.setPid(product.getPid());
        update.setPname(product.getPname());
        update.setPprice(product.getPprice());
        update.setPqty(product.getPqty());
        update.setPstock(product.getPstock());
        update.setPdescription(product.getPdescription());

        return repo.save(update);
    }

}
