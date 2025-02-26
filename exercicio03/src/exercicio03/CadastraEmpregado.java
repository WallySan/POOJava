package exercicio03;

import java.util.Scanner;

public class CadastraEmpregado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------");
        System.out.println("Cadastro de Empregado");
        System.out.println("---------------------");

        // ----------- dados empregado
        Empregado empregado = new Empregado();

        // Captura e valida��o do nome
        String nome = capturarNome(sc);
        empregado.setNome(nome);

        // Captura e valida��o do sal�rio
        double salario = capturarSalario(sc);
        empregado.setSalario(salario);

        // ----------- dados empresa
        Empresa empresa = new Empresa();

        // Captura e valida��o da raz�o social
        String razaoSocial = capturarRazaoSocial(sc);
        empresa.setRazaoSocial(razaoSocial);

        // Captura e valida��o do CNPJ
        String cnpj = capturarCNPJ(sc);
        empresa.setCNPJ(cnpj);

        // Captura e valida��o do telefone
        String fone = capturarFone(sc);
        empresa.setFone(fone);

        // ----------- dados empresa do empregado
        empregado.setEmpresa(empresa);

        // Exibe dados do empregado e da empresa ap�s inser��o
        mostrarDados(empregado);
    }

    // M�todo para capturar e validar o nome
    public static String capturarNome(Scanner sc) {
        String nome;
        while (true) {
            System.out.print("Nome: ");
            nome = sc.nextLine();
            if (!nome.isEmpty()) {
                break;
            }
            System.out.println("Nome n�o pode ser vazio. Tente novamente.");
        }
        return nome;
    }

    // M�todo para capturar e validar o sal�rio
    public static double capturarSalario(Scanner sc) {
        double salario;
        while (true) {
            System.out.print("Sal�rio: ");
            if (sc.hasNextDouble()) {
                salario = sc.nextDouble();
                if (salario > 0) {
                    break;
                } else {
                    System.out.println("O sal�rio deve ser maior que zero. Tente novamente.");
                }
            } else {
                System.out.println("Valor inv�lido! Digite um n�mero v�lido.");
                sc.next(); // Limpa o buffer do scanner
            }
        }
        return salario;
    }

    // M�todo para capturar e validar a raz�o social
    public static String capturarRazaoSocial(Scanner sc) {
        String razaoSocial;
        while (true) {
            System.out.print("Raz�o Social: ");
            razaoSocial = sc.nextLine();
            if (!razaoSocial.isEmpty()) {
                break;
            }
            System.out.println("Raz�o Social n�o pode ser vazia. Tente novamente.");
        }
        return razaoSocial;
    }

    // M�todo para capturar e validar o CNPJ
    public static String capturarCNPJ(Scanner sc) {
        String cnpj;
        while (true) {
            System.out.print("CNPJ: ");
            cnpj = sc.nextLine();
            if (cnpj.length() == 14 && cnpj.matches("\\d+")) {
                break;
            } else {
                System.out.println("CNPJ inv�lido. O CNPJ deve ter 14 d�gitos num�ricos. Tente novamente.");
            }
        }
        return cnpj;
    }

    // M�todo para capturar e validar o telefone
    public static String capturarFone(Scanner sc) {
        String fone;
        while (true) {
            System.out.print("Telefone: ");
            fone = sc.nextLine();
            if (fone.matches("\\d{10,11}")) {
                break;
            } else {
                System.out.println("Telefone inv�lido. Digite um n�mero v�lido com 10 ou 11 d�gitos.");
            }
        }
        return fone;
    }

    // M�todo para exibir os dados completos do empregado e empresa
    public static void mostrarDados(Empregado empregado) {
        System.out.println("\n------------ Dados Cadastrados ------------");
        System.out.println("Nome do Empregado: " + empregado.getNome());
        System.out.println("Sal�rio: R$ " + empregado.getSalario());

        Empresa empresa = empregado.getEmpresa();
        System.out.println("\n----------- Empresa Associada ------------");
        System.out.println("Raz�o Social: " + empresa.getRazaoSocial());
        System.out.println("CNPJ: " + empresa.getCNPJ());
        System.out.println("Telefone: " + empresa.getFone());
        System.out.println("------------------------------------------");
    }
}
