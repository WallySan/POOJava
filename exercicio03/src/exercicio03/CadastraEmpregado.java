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

        // Captura e validação do nome
        String nome = capturarNome(sc);
        empregado.setNome(nome);

        // Captura e validação do salário
        double salario = capturarSalario(sc);
        empregado.setSalario(salario);

        // ----------- dados empresa
        Empresa empresa = new Empresa();

        // Captura e validação da razão social
        String razaoSocial = capturarRazaoSocial(sc);
        empresa.setRazaoSocial(razaoSocial);

        // Captura e validação do CNPJ
        String cnpj = capturarCNPJ(sc);
        empresa.setCNPJ(cnpj);

        // Captura e validação do telefone
        String fone = capturarFone(sc);
        empresa.setFone(fone);

        // ----------- dados empresa do empregado
        empregado.setEmpresa(empresa);

        // Exibe dados do empregado e da empresa após inserção
        mostrarDados(empregado);
    }

    // Método para capturar e validar o nome
    public static String capturarNome(Scanner sc) {
        String nome;
        while (true) {
            System.out.print("Nome: ");
            nome = sc.nextLine();
            if (!nome.isEmpty()) {
                break;
            }
            System.out.println("Nome não pode ser vazio. Tente novamente.");
        }
        return nome;
    }

    // Método para capturar e validar o salário
    public static double capturarSalario(Scanner sc) {
        double salario;
        while (true) {
            System.out.print("Salário: ");
            if (sc.hasNextDouble()) {
                salario = sc.nextDouble();
                if (salario > 0) {
                    break;
                } else {
                    System.out.println("O salário deve ser maior que zero. Tente novamente.");
                }
            } else {
                System.out.println("Valor inválido! Digite um número válido.");
                sc.next(); // Limpa o buffer do scanner
            }
        }
        return salario;
    }

    // Método para capturar e validar a razão social
    public static String capturarRazaoSocial(Scanner sc) {
        String razaoSocial;
        while (true) {
            System.out.print("Razão Social: ");
            razaoSocial = sc.nextLine();
            if (!razaoSocial.isEmpty()) {
                break;
            }
            System.out.println("Razão Social não pode ser vazia. Tente novamente.");
        }
        return razaoSocial;
    }

    // Método para capturar e validar o CNPJ
    public static String capturarCNPJ(Scanner sc) {
        String cnpj;
        while (true) {
            System.out.print("CNPJ: ");
            cnpj = sc.nextLine();
            if (cnpj.length() == 14 && cnpj.matches("\\d+")) {
                break;
            } else {
                System.out.println("CNPJ inválido. O CNPJ deve ter 14 dígitos numéricos. Tente novamente.");
            }
        }
        return cnpj;
    }

    // Método para capturar e validar o telefone
    public static String capturarFone(Scanner sc) {
        String fone;
        while (true) {
            System.out.print("Telefone: ");
            fone = sc.nextLine();
            if (fone.matches("\\d{10,11}")) {
                break;
            } else {
                System.out.println("Telefone inválido. Digite um número válido com 10 ou 11 dígitos.");
            }
        }
        return fone;
    }

    // Método para exibir os dados completos do empregado e empresa
    public static void mostrarDados(Empregado empregado) {
        System.out.println("\n------------ Dados Cadastrados ------------");
        System.out.println("Nome do Empregado: " + empregado.getNome());
        System.out.println("Salário: R$ " + empregado.getSalario());

        Empresa empresa = empregado.getEmpresa();
        System.out.println("\n----------- Empresa Associada ------------");
        System.out.println("Razão Social: " + empresa.getRazaoSocial());
        System.out.println("CNPJ: " + empresa.getCNPJ());
        System.out.println("Telefone: " + empresa.getFone());
        System.out.println("------------------------------------------");
    }
}
