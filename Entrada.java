private String retornaTexto(){
    try{
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt")));
        String txt = br.readLine();
    }
    catch(IOException ex){
        System.out.println(ex);
    }
    return txt;
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
