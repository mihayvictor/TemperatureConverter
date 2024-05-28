

import java.io.IOException;

class Util {

    public static void limpar(){
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
                /* 
                * "os.namme" indentifica qual o nome do S.O. e "contains" se contém Windows.
                * "cmd" inicia o interpretador de comandos do Windows.
                * "/c" diz ao cmd para executar o comando que segue e depois terminar.
                * "cls" é o comando que limpa o terminal no Windows.
                */

            }else{
                System.out.print("\033[H\033[02J");
                System.out.flush();
                //Alternativa: new ProcessBuilder("clear").inheritIO().start().waitFor();

                /*
                 * System.out.print("\033[H\033[2J") envia códigos de escape ANSI para o terminal
                 * \033 é o caractere de escape ANSI.
                 * [H move o cursor para o canto superior esquerdo da tela.
                 * [2J limpa a tela. 
                 * 
                 * System.out.flush() força a saída do buffer para o console                         
                 * (garante que os códigos de escape sejam aplicados imediatamente).
                 */

            }
        } catch (IOException | InterruptedException e) {
            
        }
    }

    
}
