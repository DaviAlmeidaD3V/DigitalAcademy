package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotNull;

public class AvaliacaoFisicaUpdateForm {

  @NotNull(message = "o Campo Não Pode Ser Vazio")
  private double peso;

  @NotNull(message = "o Campo Não Pode Ser Vazio")
  private double altura;
}
