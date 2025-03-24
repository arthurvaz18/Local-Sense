package com.example.LocalSense.repository;

import com.example.LocalSense.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, String> {
    Optional<Cadastro> findByCpf(String cpf);
}
