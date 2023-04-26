
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws FileNotFoundException {

        // leitura de arquivos
        String arquivoOrigem = "C:\\_src\\teste23.csv";
        File arquivo = new File(arquivoOrigem);
        Scanner leitor = new Scanner(arquivo);

        // gravação de arquivos

        String arquivoDestino = "C:\\_src\\teste23.csv";
        Formatter gravador = new Formatter(arquivoDestino);
        while (leitor.hasNextLine()) {
            String linha = leitor.nextLine();
            String[] vetor = linha.split(";");

            // Imprimir no console/terminal
            System.out.println("Banco: " + linha);

            // Gravar no arquivo de destino
            gravador.format("Banco: " + linha + "\n");
            gravador.format("\n");
        }

        leitor.close();
        gravador.close();

    }
}
