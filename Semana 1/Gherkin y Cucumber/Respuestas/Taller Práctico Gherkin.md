# TALLER PRÁCTICO GHERKIN

## Compra de productos para el hogar, desde una aplicación móvil (Rol: ama de casa)

```gherkin
Feature: Compra de productos para el hogar

  Como ama de casa
  Quiero comprar productos para el hogar desde una aplicación móvil
  Para simplificar mis compras y recibirlos en casa sin necesidad de salir

  Scenario: Realizar una compra de productos para el hogar
    Given estoy en la página principal de la aplicación móvil
    When selecciono los productos que necesito para el hogar
    And añado los productos al carrito de compras
    And realizo el pago
    Then debería recibir la confirmación del pedido
    And debería ver el tiempo estimado de entrega en la pantalla
```

## Matrículas online desde una aplicación Web (Rol: estudiante)

```gherkin
Feature: Matrículas online

  Como estudiante
  Quiero matricularme en mis cursos desde una aplicación web
  Para ahorrar tiempo y evitar ir físicamente a la universidad

  Scenario: Realizar la matrícula en línea
    Given estoy en la plataforma de matrículas
    When selecciono los cursos que deseo inscribir
    And confirmo mi selección de cursos
    Then debería ver el mensaje de confirmación de matrícula exitosa
    And los cursos seleccionados deberían aparecer en mi perfil
```

## Registro de las notas finales de los estudiantes en una aplicación stand-alone (Rol: profesor)

```gherkin
Feature: Registro de notas finales

  Como profesor
  Quiero registrar las notas finales de los estudiantes en una aplicación stand-alone
  Para llevar un control preciso de sus calificaciones de manera eficiente

  Scenario: Registrar notas finales de los estudiantes
    Given estoy en la aplicación stand-alone de registro de notas
    When selecciono el curso correspondiente
    And ingreso las notas finales de los estudiantes
    Then debería ver un mensaje de confirmación de registro exitoso
    And las notas deberían quedar guardadas correctamente
```

## Control de pacientes e historial clínico en una aplicación web (Rol: médico)

```gherkin
Feature: Control de pacientes e historial clínico

  Como médico
  Quiero gestionar el control de pacientes e historial clínico en una aplicación web
  Para acceder fácilmente a la información médica y ofrecer un mejor seguimiento del tratamiento

  Scenario: Consultar historial clínico de un paciente
    Given estoy autenticado en la aplicación web
    When selecciono el historial clínico de un paciente
    Then debería poder visualizar la información médica del paciente
    And debería poder añadir nuevas notas al historial clínico
```

## Registrarse en una app de domicilios, para solicitar comida desde casa (Rol: cliente)

```gherkin
Feature: Registro en app de domicilios

  Como cliente
  Quiero registrarme en una app de domicilios
  Para poder solicitar comida desde casa de manera rápida y conveniente

  Scenario: Registrarse en la app de domicilios
    Given estoy en la página de registro de la app de domicilios
    When completo el formulario con mis datos personales
    And confirmo mi registro
    Then debería recibir un correo de confirmación
    And debería poder iniciar sesión en la app
```

## Capturar datos de clientes, para realizar un préstamo (Rol: asesor financiero)

```gherkin
Feature: Captura de datos de clientes para préstamos

  Como asesor financiero
  Quiero capturar los datos de los clientes de manera eficiente
  Para realizar un análisis crediticio y aprobar préstamos de forma rápida

  Scenario: Capturar datos para préstamo
    Given estoy en la plataforma de gestión de préstamos
    When ingreso los datos personales del cliente
    And capturo la información financiera necesaria
    Then debería poder enviar la solicitud de análisis crediticio
    And el sistema debería guardar correctamente la información del cliente
```

## Matricular estudiantes en una app web (Rol: registrador de admisiones)

```gherkin
Feature: Matricular estudiantes

  Como registrador de admisiones
  Quiero matricular a los estudiantes en una app web
  Para organizar el proceso de inscripción y evitar errores administrativos

  Scenario: Matricular un estudiante
    Given estoy en la página de matrícula de la app web
    When ingreso los datos del estudiante
    And selecciono los cursos correspondientes
    Then debería ver la confirmación de la matrícula exitosa
    And el estudiante debería aparecer registrado en el sistema
```

## Control de partes automotor en una app web (Rol: vendedor)

```gherkin
Feature: Control de partes automotor

  Como vendedor
  Quiero gestionar el control de partes automotor en una app web
  Para llevar un inventario actualizado y mejorar el servicio al cliente

  Scenario: Gestionar partes automotor
    Given estoy en la página de control de partes automotor
    When ingreso los datos de las partes disponibles
    And actualizo el inventario
    Then debería ver un mensaje de confirmación de actualización exitosa
    And el inventario debería reflejar las nuevas entradas correctamente
```
