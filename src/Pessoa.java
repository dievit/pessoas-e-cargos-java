public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private char sexo;
    private Cargo cargo;

    public Pessoa(String nome, int idade, String cpf, char sexo, Cargo cargo) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
        this.cargo = null;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido");
        }
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida");
        }
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        if (cpf !=null && !cpf.isEmpty()) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido");
        }
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F') {
            this.sexo = sexo;
        } else {
            System.out.println("Sexo inválido");
        }
    }
}
