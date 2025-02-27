// Nombre de la clase (UpperCamelCase)

class OperacionesPOO {

    // Atributos de la clase (lowerCamelCase)
    private int num1, num2;

    // Constructor con parametros
    public OperacionesPOO(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Constructor vacio 
    OperacionesPOO() {
    }

    // Metodo get (obtener) de num1
    public int getNum1() {
        return num1;
    }

    // Metodo set (asignar) de num1
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    // Metodo get (obtener) de num2
    public int getNum2() {
        return num2;
    }

    // Metodo set (asignar) de num2
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // Funcion para sumar dos numeros (lowerCamelCase)
    public int getSumar() {
        return this.num1 + this.num2;
    }

    // Funcion para restar dos numeros (lowerCamelCase)
    public int getRestar() {
        return this.num1 - this.num2;
    }

    // Funcion para multiplicar dos numeros (lowerCamelCase)
    public int getMultiplicar() {
        return this.num1 * this.num2;
    }

    // Funcion para dividir dos numeros (lowerCamelCase)
    public double getDividir() {
        return this.num1 / this.num2;
    }

    // Funcion para el modulo de dos numeros (lowerCamelCase)
    public int getModulo() {
        return this.num1 % this.num2;
    }

    @Override
    public String toString() {
        return "OperacionesPOO [num1=" + num1 + ", num2=" + num2 + "]";
    }

}
