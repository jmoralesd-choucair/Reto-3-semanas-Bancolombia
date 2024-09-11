# language: es
# Caso 1: Logueo a la sucursal virtual de Bancolombia

Característica: Logueo a la sucursal virtual personas de Bancolombia

    Como usuario del banco
    Quiero loguearme en la sucursal virtual personas de Bancolombia
    Para poder acceder a mi cuenta y realizar transacciones

    Contexto: El usuario quiere ingresar a la sucursal virtual personas de Bancolombia
        Dado que el usuario está en la página de logueo de la sucursal virtual de Bancolombia

    Escenario: Logueo exitoso a la sucursal virtual personas
        Cuando ingresa las siguientes credenciales válidas:
            | Usuario1     | contraseña  |
            | usuario2     | contraseña  |
        Entonces debería ser redirigido al dashboard de la cuenta

    Escenario: Logueo fallido a la sucursal virtual personas
        Cuando ingresa las siguientes credenciales inválidas:
            | UsuarioI     | Contraseña            |
            | usuario2     | contraseña2           |
        Entonces debería ver un mensaje de error indicando que el logueo ha fallado
