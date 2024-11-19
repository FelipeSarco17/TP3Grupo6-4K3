Feature: Evolución simple con diagnóstico previo

  Agregamos la evolución de un paciente con diagnostivo no utilizado previamente en la historia clinica
  y se escribe la misma en texto simple.

  Background: El médico ha iniciado sesión
    Given el medico "Sarco Felipe" con matricula 343234 ha iniciado sesion
    And el médico ha buscado la historia clínica del paciente con CUIL "44658630" que tiene los siguientes diagnosticos:
    |Neumonia|
    |Dengue|
    |COVID|

  Scenario:
    When el medico escribe la evolucion  "El paciente posee sintomas consistentes con Dengue (fiebre, hemorragias, etc)" para el diagnostico "Dengue"
    And el medico guarda la nueva evolucion
    Then se registra la evolucion en la historia clinica del paciente con el diagnostico, la descripcion y el medico

  Scenario:
    When el medico escribe la evolucion  "El paciente posee sintomas consistentes con COVID (fiebre, hemorragias, etc)" para el diagnostico "COVID"
    And el medico guarda la nueva evolucion
    Then se registra la evolucion en la historia clinica del paciente con el diagnostico, la descripcion y el medico





