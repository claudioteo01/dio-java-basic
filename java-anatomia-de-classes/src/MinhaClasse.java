public class MinhaClasse {
    

    public static void main (String [] args ){

        String primeiroNome = "Claudio";
        String segundoNome = "Teodoro";
        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        
        System.out.println(nomeCompleto);
       
    }

       public static String nomeCompleto (String primeiroNome, String segundoNome){

            return "Resultado do metodo nome completo:  "+ primeiroNome.concat(" ").concat(segundoNome);

       }

    

}
