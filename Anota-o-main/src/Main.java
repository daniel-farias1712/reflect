import java.lang.reflect.Method;

@Tabela(value = "Nome tabela")
public class Main {
    public static void main(String[] args) {
        try {

            Class<?> tb = Tabela.class;
            String nomeAnotacao = tb.getSimpleName();
            System.out.println("Nome da anotação: \033[31m" + nomeAnotacao+"\033[0m");

            Method[] methods = tb.getMethods();
            for (Method metod : methods) {
                System.out.println("Metodo : \033[32m" + metod.getName()+"\033[0m");

                System.out.println("Nome do metodo:\033[32m" + metod.getModifiers()+"\033[0m");
            }





        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}


