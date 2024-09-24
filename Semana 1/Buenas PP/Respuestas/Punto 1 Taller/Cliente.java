// 1. Encapsulamiento
// 2. Manejo de excepciones
// 3. Uso de f-strings (String.format en Java)
// 4. Documentación de métodos
// 5. Separación de responsabilidades

public class Cliente {
    // Atributos privados para aplicar encapsulamiento
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;

    // Constructor de la clase Cliente
    public Cliente(String nombre, String apellido, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Métodos getter y setter para encapsulamiento
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método para imprimir solo el nombre completo del cliente
    public void imprimirNombreCompleto() {
        System.out.println("Nombre completo: " + nombre + " " + apellido);
    }

    // Método para imprimir toda la información del cliente usando manejo de excepciones
    public void imprimirInformacionCompleta() {
        try {
            System.out.println("Nombre completo: " + nombre + " " + apellido);
            System.out.println("Dirección: " + direccion);
            System.out.println("Teléfono: " + telefono);
        } catch (Exception e) {
            System.out.println("Error al imprimir la información del cliente: " + e.getMessage());
        }
    }

    // Uso de f-strings (String.format en Java) para formateo de cadenas
    @Override
    public String toString() {
        return String.format("Cliente[nombre=%s, apellido=%s, direccion=%s, telefono=%s]", 
                             nombre, apellido, direccion, telefono);
    }

    // Documentación del método
    /**
     * Método principal para probar la clase Cliente
     */
    public static void main(String[] args) {
        // Creación de un objeto Cliente
        Cliente cliente = new Cliente("Sebastian", "Morales", "Calle 123", "123-4567");

        // Llamada al método para imprimir el nombre completo
        cliente.imprimirNombreCompleto();

        // Llamada al método para imprimir toda la información del cliente
        cliente.imprimirInformacionCompleta();

        // Llamada al método toString para obtener la representación del objeto como cadena
        System.out.println(cliente.toString());
    }
}
