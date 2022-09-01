import java.util.Scanner;

public class ComputadorTeste {
    public static void main(String[] args) {
        Computador pc = new Computador();

        Scanner scan = new Scanner(System.in);

        System.out.println("PC1");
        System.out.println("Insira marca:");
        pc.setMarca(scan.nextLine());
        System.out.println("Insira cor:");
        pc.setCor(scan.nextLine());
        System.out.println("Insira Modelo:");
        pc.setModelo(scan.nextLine());
        System.out.println("Insira numero de serie:");
        pc.setNumeroSerie(Long.parseLong(scan.nextLine()));
        System.out.println("Insira preco:");
        pc.setPreco(Double.parseDouble(scan.nextLine()));

        System.out.println(pc);
        pc.calcularValor();
        System.out.println(pc);

        Computador pc2 = new Computador();

        System.out.println("PC2");
        System.out.println("Insira marca:");
        pc2.setMarca(scan.nextLine());
        System.out.println("Insira cor:");
        pc2.setCor(scan.nextLine());
        System.out.println("Insira Modelo:");
        pc2.setModelo(scan.nextLine());
        System.out.println("Insira numero de serie:");
        pc2.setNumeroSerie(Long.parseLong(scan.nextLine()));
        System.out.println("Insira preco:");
        pc2.setPreco(Double.parseDouble(scan.nextLine()));

        System.out.println(pc2);
        pc2.calcularValor();
        System.out.println(pc2);

        int valorfoialterado = pc2.alterarValor(100.0);
        if (valorfoialterado == 1) {
            System.out.println("Valor alterado");
        } else {
            System.out.println("Valor NAO alterado");
        }
        System.out.println(pc2);
    }
}