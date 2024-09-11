# language: es
# Caso 3: Realizar un pago desde la sucursal virtual personas

Característica: Pago de tarjetas de crédito desde la sucursal virtual personas de Bancolombia

    Como cliente del banco
    Quiero pagar mis tarjetas de crédito desde la sucursal virtual personas
    Para mantener al día mis obligaciones financieras

    Antecedentes:
        Dado que el usuario está autenticado satisfactoriamente en la sucursal virtual personas de Bancolombia

    Esquema del escenario: Pago de la tarjeta de crédito
        Cuando selecciona la <tarjeta de crédito> e ingresa el <monto> a pagar:
        Y confirma el pago
        Entonces debería ver la confirmación del pago exitoso
    
        Ejemplos:
            | tarjeta de crédito       | monto    |
            | Visa                     | 100      |
            | Amex                     | 200      |
            | MasterCard               | 500      |