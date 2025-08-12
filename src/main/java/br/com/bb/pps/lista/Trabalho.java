package br.com.bb.pps.lista;

public abstract class Trabalho /*implements Comparable<Trabalho>*/{
    private String empresa;
    private String funcao;

    public Trabalho(String empresa, String funcao) {
        this.empresa = empresa;
        this.funcao = funcao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Empresa: " + this.empresa + "\nFunção: " + this.funcao;
    }

    /*
    @Override
    public int compareTo(Trabalho outroTrabalho) {
        return this.empresa.compareTo(outroTrabalho.getEmpresa());
    }
    */

}
