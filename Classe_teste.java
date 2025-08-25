package com.mycompany.oracle_7;


public class Classe_teste {

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the sentença
     */
    public int getSentença() {
        return sentença;
    }

    /**
     * @param sentença the sentença to set
     */
    public void setSentença(int sentença) {
        this.sentença = sentença;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the porta
     */
    public boolean isPorta() {
        return porta;
    }

    /**
     * @param porta the porta to set
     */
    public void setPorta(boolean porta) {
        this.porta = porta;
    }
    //public: visivel para qualquer classe(os metodos são tipicamente publicos)
    //pacote: visivel para o pacote atual(não existe palavra chave para este nivel de acesso)
    //private: visivel somente para a classe atual(em geral os campos são privados)
    private String nome;
    private double altura;
    private int sentença;
    private int number;
    private boolean porta = false;
    private static int statico = 1;
    
    //construtor
    
    public Classe_teste(String nome, double altura, int sentença){
        this.nome = nome;
        this.altura = altura;
        this.sentença = sentença;
    }
    
    public Classe_teste(String nome, double altura, int sentença, int number){
        this.nome = nome;
        this.altura = altura;
        this.sentença = sentença;
        this.number = number;
    }
    
    public String getNome(){
        return nome;
    }
    
    public boolean setPorta(){
        return isPorta();
    }
    
    
    //costrutor
//    public Classe_teste(String nome, double altura, int sentença){
//        this.nome = nome;
//        this.altura = altura;
//        this.sentença = sentença;
//    }
    
//    public void setFields(String n, double a, int s){
//        nome = n;
//        altura = a;
//        sentença = s;
//    }
    
    public static void testando(){
        System.out.println(statico);
    }
    
    public void display(){
        testando();
    }
    
    
}
