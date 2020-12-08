import java.util.ArrayList;

public class DiarioClasse {
    public static void main(String[] args) {

        ArrayList<String> datas = new ArrayList<>();
        datas.add("         ");
        datas.add("Data 1    ");
        datas.add("Data 2   ");
        datas.add("Data 3   ");
        datas.add("Data 4    ");
        datas.add("Data 5    ");
        datas.add("Data 6    ");

        ArrayList<String> aluno1 = new ArrayList<>();
        aluno1.add("Aluno 1  ");
        aluno1.add("Presente  ");
        aluno1.add("Ausente  ");
        aluno1.add("Ausente  ");
        aluno1.add("Presente  ");
        aluno1.add("Presente  ");
        aluno1.add("Ausente  ");

        ArrayList<String> aluno2 = new ArrayList<>();
        aluno2.add("Aluno 2  ");
        aluno2.add("Ausente   ");
        aluno2.add("Ausente  ");
        aluno2.add("Ausente  ");
        aluno2.add("Presente  ");
        aluno2.add("Ausente   ");
        aluno2.add("Ausente  ");

        ArrayList<String> aluno3 = new ArrayList<>();
        aluno3.add("Aluno 3  ");
        aluno3.add("Presente  ");
        aluno3.add("Ausente  ");
        aluno3.add("Ausente  ");
        aluno3.add("Presente  ");
        aluno3.add("Ausente   ");
        aluno3.add("Presente  ");

        ArrayList<String> aluno4 = new ArrayList<>();
        aluno4.add("Aluno 4  ");
        aluno4.add("Presente  ");
        aluno4.add("Ausente  ");
        aluno4.add("Ausente  ");
        aluno4.add("Presente  ");
        aluno4.add("Ausente   ");
        aluno4.add("Ausente  ");

        ArrayList<String> aluno5 = new ArrayList<>();
        aluno5.add("Aluno 5  ");
        aluno5.add("Ausente   ");
        aluno5.add("Presente ");
        aluno5.add("Presente ");
        aluno5.add("Presente  ");
        aluno5.add("Presente  ");
        aluno5.add("Presente  ");



        for (String Data : datas) {
            System.out.print(Data);
        }

        System.out.println("    ");

        for (String Aluno1 : aluno1) {
            System.out.print(Aluno1);
        }

        System.out.println("    ");

        for (String Aluno2 : aluno2) {
            System.out.print(Aluno2);
        }

        System.out.println("    ");

        for (String Aluno3 : aluno3) {
            System.out.print(Aluno3);
        }
        System.out.println("    ");

        for (String Aluno4 : aluno4) {
            System.out.print(Aluno4);
        }
        System.out.println("    ");

        for (String Aluno5 : aluno5) {
            System.out.print(Aluno5);
        }

    }
}
