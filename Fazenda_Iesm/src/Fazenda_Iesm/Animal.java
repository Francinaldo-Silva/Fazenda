package Fazenda_Iesm;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.DateFormat;

public class Animal {
	private int  id_animal;
	private double preco_unitario;
	private  Date data_nas;
    private String genero;
    private  Date data_vacina;
    private  float peso;
    private boolean vacina;
    static public ArrayList<Animal> animais;
    public static ArrayList<Bovino> abatebovino;
    public static ArrayList<Caprino> abatecaprino;
    public static ArrayList<Suino> abatesuino;
	public Animal(int id_animal, double preco_unitario, Date data_nas, String genero, Date data_vacina,
			float peso, boolean vacina) {
		super();
		this.id_animal = id_animal;
		this.preco_unitario = preco_unitario;
		this.data_nas = data_nas;
		this.genero = genero;
		this.data_vacina = data_vacina;
		this.peso = peso;
		this.vacina = vacina;
	}
	public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(ArrayList<Animal> animais) {
        this.animais = animais;
    }
	public int getId_animal() {
		return id_animal;
	}
	public void setId_animal(int id_animal) {
		this.id_animal = id_animal;
	}
	public double getPreco_unitario() {
		return preco_unitario;
	}
	public void setPreco_unitario(double preco_unitario) {
		this.preco_unitario = preco_unitario;
	}
	public Date getData_nas() {
		return data_nas;
	}
	public void setData_nas(Date data_nas) {
		this.data_nas = data_nas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Date getData_vacina() {
		return data_vacina;
	}
	public void setData_vacina(Date data_vacina) {
		this.data_vacina = data_vacina;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public boolean isVacina() {
		return vacina;
	}
	public void setVacina(boolean vacina) {
		this.vacina = vacina;
	}
	public void formataData(Date data_nas){

        Date setdata_nas = new Date();
        SimpleDateFormat formataDatas = new SimpleDateFormat("dd/mm/yyyy");
        String dataFormatada = formataDatas.format(setdata_nas);
        System.out.println(dataFormatada);

    }

	   public  void abate(ArrayList<Animal> animais,boolean vacina,float peso)
	   {	
		   
	       
	   }
	 
	   public void vender(ArrayList<Animal> animais,boolean vacina)
	   {
	       
	   }

}
