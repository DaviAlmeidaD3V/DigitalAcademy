package me.dio.academia.digital.entity.form;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

public class AlunoUpdateForm {

  @NotNull
  private String nome;

  @NotNull
  private String bairro;

  @NotNull
  private LocalDate dataDeNascimento;
}
