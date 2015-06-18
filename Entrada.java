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

private String retornaTextoCompleto(){
    String txt = null;
    try{

        InputStream is = new FileInputStream("arquivo.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        for (String i = br.readLine(); i != null; i = br.readLine()){
            String[] tokens = i.split(" ");
            for (String token : tokens){
                txt.concat(token);
            }
        }


    }catch (IOException ex){
        System.out.println(ex);
    }
    return txt;
}
