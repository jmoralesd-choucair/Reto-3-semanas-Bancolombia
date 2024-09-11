# language: es
# Caso 2: Reservar tiquetes en Avianca

Característica: Reservar tiquetes en la aplicación web de Avianca

    Como cliente de Avianca
    Quiero reservar tiquetes en la aplicación web
    Para poder volar a mi destino de forma rápida y segura

    Antecedentes: El usuario quiere reservar tiquetes en la aplicación web de Avianca
        Dado que el usuario está en la página de reserva de tiquetes de Avianca
        Cuando selecciona el vuelo con los siguientes detalles:
            | Origen    | Destino   | Clase     | Personas              |
            | Medellín  | Canadá    | Económica | 2 niños, 2 adultos    |
            | Bogotá    | París     | Ejecutiva | 4 niños, 4 adultos    |

    Escenario: Reserva exitosa
        Y realiza el pago de los tiquetes
        Entonces debería ver la confirmación de la reserva exitosa

    Escenario: Reserva fallida
        Y no ingresa los datos de pago correctamente
        Entonces debería ver un mensaje de error indicando que la reserva ha fallado
