class Registro {
    private String dni;
    private String nombre;
    private int edad;
    private String puesto;
    private double salario;

    public Registro(String dni, String nombre, int edad, String puesto, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }
}