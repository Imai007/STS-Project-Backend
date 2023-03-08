package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ProductMusic;

public interface MusicRepository extends JpaRepository<ProductMusic,Integer>{

}