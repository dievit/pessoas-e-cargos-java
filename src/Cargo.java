public class Cargo {
    private String nome;
    private String funcao;
    private String departamento;
    private boolean status; // true = ativo, false = inativo
    private double salario;

    public Cargo(String nome, String funcao, String departamento, boolean status, double salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.departamento = departamento;
        this.status = status;
        this.salario = salario;
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

    public String getFuncao() {
        return this.funcao;
    }

    public void setFuncao(String funcao) {
        if (funcao != null && !funcao.isEmpty()) {
            this.funcao = funcao;
        } else {
            System.out.println("Função inválida");
        }
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        if (departamento != null && !departamento.isEmpty()) {
            this.departamento = departamento;
        } else {
            System.out.println("Departamento inválido");
        }
    }

    public boolean getStatus() {
        return status;
    }

    public String getStatusString() {
        return status ? "Ativo" : "Inativo";
    }

    public void setStatus(boolean Status) {
        this.status = status;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario() {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Salário inválido");
        }
    }


}
