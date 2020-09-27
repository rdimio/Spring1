package ru.geekbrains.lesson6_spring_boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.geekbrains.lesson6_spring_boot.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>, JpaSpecificationExecutor<Product> {

/*    @Query("select p from Product p where p.price >= :min_price ")
    List<Product> findByMinPrice(@Param("min_price") BigDecimal min_price);

    @Query("select p from Product p where p.price <= :max_price ")
    List<Product> findByMaxPrice(@Param("max_price") BigDecimal max_price);

    @Query("select p from Product p where p.price <= :max_price and p.price >= :min_price")
    List<Product> findByMinAndMaxPrice(@Param("min_price") BigDecimal min_price, @Param("max_price") BigDecimal max_price);*/
}
