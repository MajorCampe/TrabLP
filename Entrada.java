private String retornaTexto(){ 
    try { // encapsulamento para tratar uma possivel exception

    /* Cria uma variável de BufferdReader chamada "br" que recebe uma nova instância de BufferedReaderm que por sua vez recebe por paramentro uma nova instância de InputStreamReader (o leitor padrão de stream de entrada), que por sua vez recebe por parâmetro uma nova instância de FileInputStream (classe responsável pelo tratamento de entrada de arquivos) recebendo por parametro o nome do arquivo a ser lido. */
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt"))); 


        String txt = br.readLine(); // lê a linha do arquivo e guarda como String na variavel txt
    } catch (IOException ex) {
                   System.out.println(ex); // imprime no console a exception que por ventura ocorreu.
        }
    return txt; //retorno do metodo, joga a string txt para quem chamou o metodo.
}

private String retornaTextoCompleto() {
        String txt = null;
        try {

            InputStream is = new FileInputStream("arquivo.txt"); // Cria uma instancia de InputStream do tipo "File" que recebe um arquivo a ser lido.
            InputStreamReader isr = new InputStreamReader(is); //Cria um StreamReader que recebe o ImputStream criado acima por parametro.
            BufferedReader br = new BufferedReader(isr); //Cria um BufferedReader recebendo o StreamReader por parametro.

            /* Faz um "for" percorrendo todas as possíveis linhas de entrada o BufferedReader */
            for (String i = br.readLine(); i != null; i = br.readLine()) {

                String[] tokens = i.split(" "); // Acumula cada palavra linha em um vetor de Strings chamado tokens.

                for (String token : tokens) { //"for" que percorre a coleção (vetor de string) 
                    txt.concat(token); //Junta cada string do vetor em uma String só, para criar o retorno de saida do metodo.


                }
            }


        } catch (IOException ex) {
            System.out.println(ex); //Imprime no console uma possivel exception
        }
        return txt; //Retorna a string lida do arquivo para quem chamou o metodo.
    }
