mport java.util.Scanner;
import javax.swing.*;
import java.security.Security;
import java.util.function.IntToDoubleFunction;
import static javax.swing.JOptionPane.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome;
        int x;

        nome = showInputDialog(null, "Inserisci il tuo nome", "user");
        checkName(nome);
        x = JOptionPane.showConfirmDialog(null, "Vuoi davvero questo nome? Potrai cambiarlo solo una volta in seguito", "ATTENZIONE", YES_NO_OPTION, QUESTION_MESSAGE);

        do {
            nome = showInputDialog(null, "Inserisci il tuo nome", "user");
            checkName(nome);
            x = JOptionPane.showConfirmDialog(null, "Vuoi davvero questo nome? Potrai cambiarlo solo una volta in seguito", "ATTENZIONE", YES_NO_OPTION, QUESTION_MESSAGE);
        } while (x == 1);

        showMessageDialog(null, "benvenuto " + nome);
        nome 

    }




    public static void checkName(String nome) {
        int prova;
        do {
            if (nome.isBlank()) {
                showMessageDialog(null, "Il nome non può essere bianco", "ERRORE", ERROR_MESSAGE);
                nome = showInputDialog(null, "Inserisci il tuo nome", "user");
            }
            prova = nome.length();
            if (prova > 8) {
                showMessageDialog(null, "Il nome non deve avere più di 8 caratteri", "ERRORE", ERROR_MESSAGE);
                nome = showInputDialog(null, "Inserisci il tuo nome", "user");
            }
        } while (nome.isBlank() || prova > 8);
    }
}
