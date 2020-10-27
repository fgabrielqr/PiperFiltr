
package pipefilter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//Exemplo de código onde tem o estilo de arquitetura Pipes and Filters gravação de arquivo tipo .txt
//usando filewriter onde escreve a linha e o printwriter onde ler em cada linha.
public class PipeFilter {
    public static String DIRETORIO = PipeFilter.class.getResource(".").getPath() + "/";
  
    public static void main(String[] args) {
       FileWriter arquivo;
       PrintWriter formatado;
        try {
            arquivo = new FileWriter(DIRETORIO + "texto1.txt");
            formatado = new PrintWriter(arquivo);
            
            formatado.println("Felipe");
            
            formatado.close();
            
            System.out.println("Salvo com sucesso!");
        } catch (IOException erro) {
            System.out.println("Não consegui criar o arquivo!");
            erro.printStackTrace();
        }
       
    }
    
}
