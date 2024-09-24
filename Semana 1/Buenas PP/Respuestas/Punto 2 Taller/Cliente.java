public class Cliente {
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

    // Refactorización: Método para validar los datos del cliente
    private boolean validarDatos() {
        return nombre != null && apellido != null && direccion != null && telefono != null;
    }

    // Refactorización: Extraer método para imprimir nombre completo
    public void imprimirNombreCompleto() {
        System.out.println("Nombre completo: " + nombre + " " + apellido);
    }

    // Método refactorizado para imprimir toda la información del cliente
    public void imprimirInformacionCompleta() {
        if (validarDatos()) {
            imprimirNombreCompleto();
            System.out.println("Dirección: " + direccion);
            System.out.println("Teléfono: " + telefono);
        } else {
            System.out.println("Información incompleta.");
        }
    }

    // Refactorización: Uso de String.format para mejorar la claridad en la salida de datos
    @Override
    public String toString() {
        return String.format("Cliente[nombre=%s, apellido=%s, direccion=%s, telefono=%s]", 
                             nombre, apellido, direccion, telefono);
    }

    // Método principal para probar la clase refactorizada
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Sebastian", "Morales", "Calle 123", "123-4567");
        
        // Prueba del método para imprimir información completa
        cliente.imprimirInformacionCompleta();
        
        // Representación del cliente como cadena
        System.out.println(cliente.toString());
    }
}
