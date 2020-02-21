package Fazenda_Iesm;

import java.util.ArrayList;

public class Fazenda
{
	private String nome;
	private int id_fazenda;
    private ArrayList<Animal> animais;
    private ArrayList<Fazenda> fazenda;

	public Fazenda(String nome, int id_fazenda, ArrayList<Animal> animais, ArrayList<Fazenda> fazenda) {
		super();
		this.nome = nome;
		this.id_fazenda = id_fazenda;
		this.animais = animais;
		this.fazenda = fazenda;
	}
	public ArrayList<Animal> getAnimais() {
		return animais;
	}
	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}
	public ArrayList<Fazenda> getFazenda() {
		return fazenda;
	}
	public void setFazenda(ArrayList<Fazenda> fazenda) {
		this.fazenda = fazenda;
	}
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public int getId_fazenda() 
	{
		return id_fazenda;
	}
	public void setId_fazenda(int id_fazenda)
	{
		this.id_fazenda = id_fazenda;
	}
	
	public boolean comprar_animal()
	{
		return true;
	}
	public int vender_animal()
	{
		return id_fazenda;
	}
	public boolean abater_animal()
	{
		return false;
	}

}
