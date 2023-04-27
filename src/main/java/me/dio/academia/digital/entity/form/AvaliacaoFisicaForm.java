package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  @Positive(message = "Id Precisa ser um Numero Positivo")
  private Long alunoId;

  @NotNull(message = "o Campo Não Pode Ser Vazio")
  private double peso;

  @NotNull(message = "o Campo Não Pode Ser Vazio")
  private double altura;
}
