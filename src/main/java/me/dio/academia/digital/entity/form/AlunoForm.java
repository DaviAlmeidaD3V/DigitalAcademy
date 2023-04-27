package me.dio.academia.digital.entity.form;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotEmpty(message = "Preencha o Campo Corretamente")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres. ")
  private String nome;

  @NotNull
  private String cpf;

  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres. ")
  @NotEmpty(message = "Preencha o Campo Corretamente")
  private String bairro;

  @NotNull
  @Past(message = "a Data '&{validatedValue}' é invalida. ")
  private LocalDate dataDeNascimento;
}
