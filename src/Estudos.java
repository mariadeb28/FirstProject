public class Estudos {
    public static void main(String[] args) {
        double temperaturaDeCelsius = 30.4;
        double temperaturaDeFahrenheit = (temperaturaDeCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaDeCelsius, temperaturaDeFahrenheit);
        System.out.println(mensagem);

        int temperaturaDeFahrenheitInteira = (int) temperaturaDeFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaDeFahrenheitInteira);
    }
}
