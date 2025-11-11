package com.test.test_api.repositories;


import com.test.test_api.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {
    //  méthodes personnalisées ici si besoin

}

