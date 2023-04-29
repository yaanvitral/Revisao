import java.util.Scanner;

public class ProgramaDiagnosticoRevisao {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int nivelinfectado = 0;
    int reinicio = 0;
    String informacaocartao; 
    String sintoma; 
    String contato; 
    String retornoviagem;

    System.out.print("Informe seu nome:");
    String nome = scanner.next();
    System.out.print("Informe sua idade:");
    int idade = scanner.nextInt();

    while (true) {

      while (true) {
        System.out.println("Seu cartão de vacina está em dia?\nDigite sim ou nao");
        informacaocartao = scanner.next();
        if (informacaocartao.equals("nao")) {
          nivelinfectado = nivelinfectado + 10;
          break;
        } else if (informacaocartao.equals("sim")) {
          break;
        } else {
          reinicio++;
          if (reinicio == 3) {
            break;
          }
        }
      }
      if (reinicio == 3) {
        System.out.println("Não foi possível realizar o diagnóstico.Gentileza procurar ajuda médica caso apareça algum sintoma.");
        break;
      }
      reinicio = 0;

      while (true) {
        System.out.println("Teve algum dos sintomas recentemente?\nEx: Dor de cabeça, febre, náusea, dor articular, gripe.\nDigite sim ou nao:");
        sintoma = scanner.next();
        if (sintoma.equals("sim")) {
          nivelinfectado = nivelinfectado + 30;
          break;
        } else if (sintoma.equals("nao")) {
          break;
        } else {
          reinicio++;
          if (reinicio == 3) {
            break;
          }
        }
      }
      if (reinicio == 3) {
        System.out.println("Não foi possível realizar o diagnóstico.Gentileza procurar ajuda médica caso apareça algum sintoma.");
        break;
      }
      reinicio = 0;

      while (true) {
        System.out.println("Teve contato com pessoas com sintomas gripais nos últimos dias?\nDigite sim ou nao:");
        contato = scanner.next();
        if (contato.equals("sim")) {
          nivelinfectado = nivelinfectado + 30;
          break;
        } else if (contato.equals("nao")) {
          break;
        } else {
          reinicio++;
          if (reinicio == 3) {
            break;
          }
        }
      }
      if (reinicio == 3) {
        System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
        break;
      }
      reinicio = 0;

      while (true) {
        System.out.println("Está retornando de viagem realizada no exterior? \n Digite sim ou nao:");
        retornoviagem = scanner.next();
        if (retornoviagem.equals("sim")) {
          nivelinfectado = nivelinfectado + 30;
          System.out.println("Você ficará sob observação por 05 dias.");
          break;
        } else if (retornoviagem.equals("nao")) {
          break;
        } else {
          reinicio++;
          if (reinicio == 3) {
            break;
          }
        }
      }
      if (reinicio == 3) {
        System.out.println("Não foi possível realizar o diagnóstico. \nGentileza procurar ajuda médica caso apareça algum sintoma.");
        break;
      }
      reinicio = 0;
      
      System.out.printf("Nome: " + nome + "\nIdade: " + idade);
      System.out.printf ("\nCartão de vacina está em dia: " + informacaocartao + "\nTeve sintomas recentemente: " + sintoma + "\nTeve contato com pessoas infectadas: " + contato + "\nEstá retornando de viagem: " + retornoviagem);
      System.out.printf("\nSua probabilidade de estar infectado(a) é de: " + nivelinfectado);

      if (nivelinfectado <= 30)
      System.out.println("\nPaciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.");
    else if (nivelinfectado <= 60)
      System.out.println("\nPaciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.");
    else if (nivelinfectado >= 90)
      System.out.println("\nPaciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado");
            
      break;
    }

    scanner.close();
  }
}