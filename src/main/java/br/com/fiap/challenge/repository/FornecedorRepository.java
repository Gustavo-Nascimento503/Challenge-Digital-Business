package br.com.fiap.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.challenge.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> { }
